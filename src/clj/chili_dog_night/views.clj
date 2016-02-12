(ns chili-dog-night.views
  (:require [hiccup.page :as h]
            [hiccup.element :as el]
            [clj-rss.core :as rss]
            [clj-time.core :as t]
            [clj-time.coerce :as c]
            [clj-time.format :as f]
            [clojure.string :as str]))

(defn header []
  [:header {:role "banner"}
   [:h1 (el/link-to "/" "Chili Dog Night")]
   [:nav
    (el/unordered-list [;(el/link-to "/gatherings" "Gatherings")
                        (el/link-to "/about" "About")
                        (el/link-to "/colophon" "Colophon")
                        (el/link-to "/rss" "RSS")])]])

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
    [:link {:rel "alternate" :type "application/rss+xml" :href "/rss" :title "Chili Dog Night"}]
    head]
   [:body
    (header)
    [:main body]
    (footer)]))

(defn film-citation [film]
  [:cite
   (el/link-to (:uri film)
               (str/replace (:title film) #"\s" "&nbsp;"))])

(defn comma-separate [coll]
  (concat [" "] (reduce #(apply vector [% ", " %2]) coll)))

(defn comma-separate-str [coll]
  (if (= (count coll) 1)
    (first coll)
    (str (reduce #(str % ", " %2) (drop-last coll))
       ", and "
       (last coll))))

(defn gathering-partial [data]
  [:section
   [:h2 (:date data)]
   [:p (comma-separate-str (sort (:attendees data)))
    " experienced "
    (comma-separate
     (map film-citation (:media data)))
    ". They ate " (comma-separate-str (:food data)) "."]
   [:p "This is what they discussed during, and between films:"]
   (:notes data)])

(defn not-found []
  (common "404"
          [:meta {:description "You look lost."}]
          [:section
           [:h2 404]
           [:p "The resource you requested was not found."]]))

(defn home [data]
  (common "Our cinematic torture chamber."
          [:meta {:description "This is the story of a friendship forged in food, film, and fear. It is pain, but it is also laughter. This is Chili Dog Night."}]
          (gathering-partial data)))

(defn gathering [data]
  (common (:date data)
          [:meta {:description (:synopsis data)}]
          (gathering-partial data)))

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
            ". The Really Simple Syndication (RSS) feed is created via "
            (el/link-to "https://github.com/yogthos/clj-rss" "clj-rss")
            ". The font used throughout is "
            (el/link-to "https://www.google.com/fonts/specimen/Playfair+Display" "Playfair Display")
            " provided by "
            (el/link-to "https://www.google.com/fonts" "Google Fonts")
            "."]
           [:p "The domain name was purchased through "
            (el/link-to "https://www.namecheap.com/" "NameCheap")
            ". Hosting of the application is provided by "
            (el/link-to "https://www.heroku.com" "Heroku")
            ". The project source code is publicly available and stored on "
            (el/link-to "https://github.com/chili-dog-night/site" "GitHub")
            "."]]))

(defn str->date [str]
  (c/to-date (f/parse (f/formatter "yyyy/MM/dd") str)))

(defn rss-feed-item [item]
  (let [date (:date item)]
    {:title date
     :pubDate (str->date date)
     :description (:synopsis item)
     :link (str "http://www.chilidognight.com/gatherings/" date)}))

(defn rss-feed [items]
  (rss/channel-xml {:title "Chili Dog Night"
                    :language "en-us"
                    :pubDate (c/to-date (t/today-at 12 00))
                    :lastBuildDate (str->date (:date (first items)))
                    :docs "http://blogs.law.harvard.edu/tech/rss"
                    :link "http://www.chilidognight.com"
                    :copyright "Copyright 2016, Chili Dog Night Productions"
                    :description "The latest gatherings from your friends at Chili Dog Night."}
                   (map rss-feed-item items)))
