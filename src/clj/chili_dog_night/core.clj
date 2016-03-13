(ns chili-dog-night.core
  (:use ring.middleware.gzip)
  (:require [ring.util.response :refer [file-response]]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [clj-rss.core :as rss]
            [clojure.edn :as edn]
            [chili-dog-night.data :as data]
            [chili-dog-night.views :as views])
  (:gen-class))

(def ^:dynamic *rss-feed-item-limit* 20)

(defroutes routes
  (GET "/" [] (views/home (first data/gatherings)))
  (GET "/gatherings/:year/:month/:day" [year month day]
    (when-let [gathering (first
                          (filter #(= (:date %) (str year "/" month "/" day))
                                  data/gatherings))]
      (views/gathering gathering)))
  (GET "/colophon" [] (views/colophon))
  (GET "/about" [] (views/about))
  (GET "/rss" []
    {:status 200
     :headers {"Content-Type" "text/xml"}
     :body (views/rss-feed (take *rss-feed-item-limit* data/gatherings))})
  (route/files "/" {:root "target/resources"})
  (route/not-found (views/not-found)))

(defn read-inputstream-edn [input]
  (edn/read
   {:eof nil}
   (java.io.PushbackReader.
    (java.io.InputStreamReader. input "UTF-8"))))

(defn parse-edn-body [handler]
  (fn [request]
    (handler (if-let [body (:body request)]
               (assoc request
                      :edn-body (read-inputstream-edn body))
               request))))

(def handler
  (wrap-reload (-> routes
                   parse-edn-body
                   (wrap-gzip))))

(defn -main [& [port]]
  (run-jetty handler {:join? false
                      :port (read-string port)}))
