(ns chili-dog-night.core
  (:use ring.middleware.gzip
        ring.middleware.params)
  (:require [buddy.auth :refer [authenticated? throw-unauthorized]]
            [buddy.auth.backends :as backends]
            [buddy.auth.middleware :refer [wrap-authentication]]
            [buddy.hashers :as hashers]
            [chili-dog-night.data :as data]
            [chili-dog-night.views :as views]
            [clj-redis-session.core :refer [redis-store]]
            [clj-rss.core :as rss]
            [clojure.java.jdbc :as jdbc]
            [clojure.math.numeric-tower :as m]
            [clojure.string :as str]
            [compojure.core :refer [defroutes context GET POST]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [java-jdbc.sql :as sql]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.reload :refer [wrap-reload]]
            [ring.middleware.session :refer [wrap-session]]
            [ring.util.response :refer [redirect response file-response]])
  (:gen-class))

(def ^:dynamic *rss-feed-item-limit* 20)
(def ^:dynamic *backend* (backends/session))
(def ^:dynamic db-spec (System/getenv "DATABASE_URL"))
(def ^:dynamic redis-conn {:pool {:max-active 20}
                           :spec {:uri (System/getenv "REDIS_URL")}})

(defn elo-expected-score [ra rb]
  (/ 1 (+ 1 (m/expt 10 (/ (- rb ra) 400)))))

(defn query-media-ids
  ([] (query-media-ids db-spec))
  ([db-spec]
   (jdbc/query db-spec
               (sql/select * :media)
               {:result-set-fn #(shuffle %)})))

(defn query-media-by-rating []
  (jdbc/query db-spec
              (sql/select * :media
                          (sql/order-by {:rating :desc}))))

(defn update-rating [a b]
  (jdbc/with-db-transaction [trans-conn db-spec]
    (let [media-a (jdbc/query trans-conn
                              (sql/select * :media
                                          (sql/where {:id (:id a)}))
                              {:result-set-fn #(first %)})
          media-b (jdbc/query trans-conn
                              (sql/select * :media
                                          (sql/where {:id (:id b)}))
                              {:result-set-fn #(first %)})
          actual-score-a (if (:winner a) 1 0)
          actual-score-b (if (:winner b) 1 0)
          expected-score-a (elo-expected-score (:rating media-a) (:rating media-b))
          expected-score-b (elo-expected-score (:rating media-b) (:rating media-a))]
      (jdbc/update! trans-conn :media
                    {:rating (Integer. (str (m/round (+ (:rating media-a) (* 32 (- actual-score-a expected-score-a))))))}
                    (sql/where {:id (:id media-a)}))
      (jdbc/update! trans-conn :media
                    {:rating (Integer. (str (m/round (+ (:rating media-b) (* 32 (- actual-score-b expected-score-b))))))}
                    (sql/where {:id (:id media-b)})))))

(defn requires-admin [f req]
  (if-not (authenticated? req)
    (throw-unauthorized)
    (f)))

(defn admin [req]
  (requires-admin
   #(apply views/admin (take 2 (query-media-ids)))
   req))

(defroutes api-routes
  (context "/api" []
    (POST "/media/vote" [selected-media-id media-a-id media-b-id]
          (partial requires-admin (fn []
                                    (let [media (map #(hash-map :id (Integer. %) :winner (= selected-media-id %))
                                                     [media-a-id media-b-id])]
                                      (apply update-rating media)
                                      (redirect "/app")))))))

(defn render-gathering [d year month day]
  (let [gatherings (drop-while #(not (= (:date %) (str year "/" month "/" day)))
                               d)]
    (when-not (empty? gatherings)
      (apply views/gathering (take 2 gatherings)))))

(defn find-user-by-email [email]
  (when-not (nil? email)
    (jdbc/query db-spec
                ["SELECT * FROM users WHERE email = ?" email]
                {:result-set-fn first})))

(defn login-authenticate
  [request]
  (let [email (str/lower-case (get-in request [:form-params "email"]))
        password (get-in request [:form-params "password"])
        session (:session request)
        user (find-user-by-email email)]
    (if (hashers/check password (:password user))
      (-> (redirect "/app")
          (assoc :session (assoc session :identity user)))
      (views/login))))

(defroutes routes
  (GET "/" [] (apply views/home (take 2 data/gatherings)))
  (GET "/login" [] (views/login))
  (POST "/login" [] login-authenticate)
  (GET "/logout" []
    (-> (redirect "/")
        (assoc :session {})))
  (GET "/make-movies-great-again" []
    (apply views/home (take 2 data/make-movies-great-again)))
  (GET "/make-movies-great-again/:year/:month/:day" [year month day]
    (render-gathering data/make-movies-great-again year month day))
  (GET "/gatherings/:year/:month/:day" [year month day]
    (render-gathering data/gatherings year month day))
  (GET "/colophon" [] (views/colophon))
  (GET "/about" [] (views/about))
  (GET "/rss" []
    {:status 200
     :headers {"Content-Type" "text/xml"}
     :body (views/rss-feed (take *rss-feed-item-limit* data/gatherings))})
  (GET "/ratings" [] (views/ratings (query-media-by-rating)))
  (GET "/app" [] admin)
  api-routes
  (route/files "/" {:root "target/resources"})
  (route/not-found (views/not-found)))

(def handler
  (wrap-reload (-> routes
                   (wrap-authentication *backend*)
                   (wrap-params)
                   (wrap-session {:store (redis-store redis-conn {:expire-secs (* 3600 24)
                                                                  :reset-on-read true})})
                   (wrap-gzip))))

(defn -main [& [port]]
  (run-jetty handler {:join? false
                      :port (read-string port)}))
