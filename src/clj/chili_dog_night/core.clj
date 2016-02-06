(ns chili-dog-night.core
  (:require [ring.util.response :refer [file-response]]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [clojure.edn :as edn]
            [chili-dog-night.data :as data]
            [chili-dog-night.views :as views])
  (:gen-class))


(defroutes routes
  (GET "/" [] (views/home (first data/gatherings)))
  (GET "/colophon" [] (views/colophon))
  (GET "/about" [] (views/about))
  (route/files "/" {:root "target"}))

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
                   parse-edn-body)))

(defn -main [& [port]]
  (run-jetty handler {:join? false
                      :port (read-string port)}))
