(set-env!
 :resource-paths #{"resources"}
 :source-paths #{"src/clj" "src/cljs"}
 :dependencies '[[adzerk/boot-cljs "1.7.228-1"]
                 [adzerk/boot-reload "0.4.5"]
                 [pandeiro/boot-http "0.7.1-SNAPSHOT"]
                 [org.martinklepsch/boot-garden "1.3.0-0"]
                 [ring "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [org.omcljs/om "1.0.0-alpha28"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [org.clojure/core.async "0.2.371"]])

(require
 '[adzerk.boot-cljs :refer [cljs]]
 '[adzerk.boot-reload :refer [reload]]
 '[pandeiro.boot-http :refer [serve]]
 '[org.martinklepsch.boot-garden :refer [garden]])

(deftask css []
  (comp
   (garden :styles-var 'chili-dog-night.styles/screen)))

(deftask dev []
  (comp (serve :handler 'chili-dog-night.core/handler :reload true)
        (watch)
        (css)
        (reload :on-jsload 'chili-dog-night.core/main)
        (cljs :source-map true :optimizations :none)))

(deftask build []
  (comp
   (cljs :optimizations :advanced)
   (css)
   (aot :namespace '#{chili-dog-night.core})
   (pom :project 'chili-dog-night
        :version "0.1.0")
   (uber)
   (jar :main 'chili-dog-night.core)))
