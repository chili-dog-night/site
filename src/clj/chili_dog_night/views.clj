(ns chili-dog-night.views
  (:require [hiccup.page :as h]
            [hiccup.element :as el]))

(defn header []
  [:header {:role "banner"}
   [:h1 (el/link-to "/" "Chili Dog Night")]
   [:nav
    (el/unordered-list [;(el/link-to "/gatherings" "Gatherings")
                        (el/link-to "/about" "About")
                        (el/link-to "/colophon" "Colophon")])]])

(defn footer []
  [:footer {:role "contentinfo"}
   [:p "©&nbsp;2016 Chili Dog Night Productions"]])

(defn common [title head body]
  (h/html5
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
    (h/include-css "//fonts.googleapis.com/css?family=Playfair+Display:400,400italic,700,700italic,900,900italic")
    (h/include-css "/css/styles.css")
    [:title (str title " | " "Chili Dog Night")]
    head]
   [:body
    (header)
    [:main body]
    (footer)]))

(defn film-citation [film]
  [:cite
   (el/link-to (:uri film) (:title film))])

(defn comma-separate [coll]
  (concat [" "] (reduce #(apply vector [% ", " %2]) coll)))

(defn comma-separate-str [coll]
  (str (reduce #(str % ", " %2) (drop-last coll))
       ", and "
       (last coll)))

(defn gathering [data]
  [:section
   [:h2 (:date data)]
   [:p (comma-separate-str (sort (:attendees data)))
    " experienced "
    (comma-separate
     (map film-citation (:media data)))
    ". They ate " (comma-separate-str (:food data)) " en masse."]
   [:p "This is what they discussed during, and between films:"]
   (:notes data)])

(defn home [data]
  (common "Our cinematic torture chamber."
          [:meta {:description "This is the story of a friendship forged in food, film, and fear. It is pain, but it is also laughter. This is Chili Dog Night."}]
          (gathering data)))

(defn about []
  (common "About"
          [:meta {:description "Somehow we got the part. Don't ask. This is Chili Dog Night."}]
          [:section
           [:h2 "About"]
           [:p "Chili Dog Night is a celebration of the worst kinds of moving images "
            "experienced in tandem with relatively unhealthy foods. "
            "The primary objective is to deconstruct and ridicule movies that don't have an "
            "excuse for their bad behavior. While the occasional obvious choice is "
            "consumed, like "
            (film-citation {:title "The Room" :uri "http://www.theroommovie.com/"})
            ", the real focus, and most painful kind of movie, is mainstream mediocrity, like "
            (film-citation {:title "Aloha" :uri "http://www.imdb.com/title/tt1243974/"})
            "."]
           [:p "As of this moment Chili Dog Night is Alex Sanchez, Jason Aumann, "
            "Greg Ryan, Jacob Dobner, Matt Beck, Colin Teal, and Kaia. They all hail from Seattle, "
            "and are slowly losing their minds one film at a time."]]))

(defn colophon []
  (common "Colophon"
          [:meta {:description "We made it good with a beginning, middle, and end. This is Chili Dog Night."}]
          [:section
           [:h2 "Colophon"]
           [:p "This website was made possible by "
            (el/link-to "http://clojure.org/" "Clojure")
            " and "
            (el/link-to "https://github.com/clojure/clojurescript" "ClojureScript")
            ". Compilation of the application is facilitated by "
            (el/link-to "http://boot-clj.com/" "Boot")
            " and its myriad friends (e.g., "
            (el/link-to "https://github.com/adzerk-oss/boot-cljs" "boot-cljs")
            ", "
            (el/link-to "https://github.com/adzerk-oss/boot-reload" "boot-reload")
            ", and "
            (el/link-to "https://github.com/pandeiro/boot-http" "boot-http")
            "). Hypertext Markup Language (HTML) is generated via "
            (el/link-to "https://github.com/weavejester/hiccup" "Hiccup")
            ", and the Cascading Style Sheets (CSS) are grown with help from "
            (el/link-to "https://github.com/noprompt/garden" "Garden")
            ". The font throughout is "
            (el/link-to "https://www.google.com/fonts/specimen/Playfair+Display" "Playfair Display")
            " provided by "
            (el/link-to "https://www.google.com/fonts" "Google Fonts")
            "."]
           [:p "Hosting of the application is provided by "
            (el/link-to "https://www.heroku.com" "Heroku")
            ", and the source code is stored on "
            (el/link-to "https://github.com" "GitHub")
            "."]]))
