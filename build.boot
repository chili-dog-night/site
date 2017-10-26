(set-env!
 :source-paths #{"src/clj" "src/cljs"}
 :dependencies '[[adzerk/boot-cljs "2.1.4"]
                 [adzerk/boot-reload "0.5.2"]
                 [pandeiro/boot-http "0.8.3"]
                 [ring "1.5.0"]
                 [amalloy/ring-gzip-middleware "0.1.3"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [clj-redis-session "2.1.0"]
                 [clj-rss "0.2.3"]
                 [clj-time "0.12.0"]
                 [java-jdbc/dsl "0.1.3"]
                 [buddy/buddy-auth "1.2.0"]
                 [buddy/buddy-hashers "1.0.0"]
                 [org.postgresql/postgresql "9.4.1208"]
                 [org.omcljs/om "1.0.0-beta1"]
                 [org.clojure/clojure "1.9.0-beta2"]
                 [org.clojure/clojurescript "1.9.946"]
                 [org.clojure/core.async "0.3.443"]
                 [org.clojure/java.jdbc "0.6.2-alpha2"]
                 [org.clojure/math.numeric-tower "0.0.4"]])

(require
 '[adzerk.boot-cljs :refer [cljs]]
 '[adzerk.boot-reload :refer [reload]]
 '[pandeiro.boot-http :refer [serve]])

(deftask dev []
  (comp (serve :handler 'chili-dog-night.core/handler :reload true)
        (watch)
        (reload :ids #{"resources/js/main"})
        (cljs :ids #{"resources/js/main"} :source-map true :optimizations :none)))

(deftask build []
  (comp
   (cljs :optimizations :advanced)
   (aot :namespace '#{chili-dog-night.core})
   (pom :project 'chili-dog-night
        :version "0.1.0")
   (uber)
   (jar :main 'chili-dog-night.core)
   (target)))
