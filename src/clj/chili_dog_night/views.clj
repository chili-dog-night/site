(ns chili-dog-night.views
  (:require [hiccup.page :as h]
            [hiccup.element :as el]
            [clj-rss.core :as rss]
            [clj-time.core :as t]
            [clj-time.coerce :as c]
            [clj-time.format :as f]
            [clojure.string :as str]))

(defn link-to [url text]
  (el/link-to {:class "link blue underline-hover"}
              url
              text))

(defn headline [text]
  [:h2.f2.f-subheadline-ns.lh-title.mb4.mt0 text])

(defn p
  ([] [:p.f4.f3-ns.measure.lh-copy])
  ([body] (into (p) body)))

(defn header []
  [:header.db.dt-l.w-100.border-box.pa3.ph5-l {:role "banner"}
   [:h1.db.dtc-l.v-mid.w-100.w-25-l.tc.tl-l.mb2.mb0-l
    (el/link-to {:class "link dark-gray underline-hover"} "/" "Chili Dog Night")]
   [:nav.db.dtc-l.v-mid.w-100.w-75-l.tc.tr-l
    (el/link-to {:class "link underline-hover blue f6 f5-l dib mr3 mr4-l"}
                "/ratings"
                "Ratings")
    (el/link-to {:class "link underline-hover blue f6 f5-l dib mr3 mr4-l"}
                "/make-movies-great-again"
                "Make Movies Great Again")
    (el/link-to {:class "link underline-hover blue f6 f5-l dib mr3 mr4-l"}
                "/about"
                "About")
    (el/link-to {:class "link underline-hover blue f6 f5-l dib"}
                "/colophon"
                "Colophon")]])

(defn footer []
  [:footer.ph3.ph5-ns{:role "contentinfo"}
   [:p "©&nbsp;2016 Chili Dog Night Productions"]])

(defn common [title head body]
  (h/html5 {:lang "en"}
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    (h/include-css "//cdnjs.cloudflare.com/ajax/libs/tachyons/4.5.5/tachyons.min.css")
    [:title (str title " | " "Chili Dog Night")]
    [:link {:rel "alternate" :type "application/rss+xml" :href "/rss" :title "Chili Dog Night"}]
    head]
   [:body.w-100.sans-serif
    (header)
    [:main body]
    (footer)]))

(defn film-citation [film]
  [:cite {:itemscope ""
          :itemtype "http://schema.org/Movie"}
   [:meta {:itemprop "name"
           :content (:title film)}]
   (link-to (:uri film)
            (str/replace (:title film) #"\s" "&nbsp;"))])

(defn person [name]
  [:span {:itemscope ""
          :itemtype "http://schema.org/Person"}
   [:span {:itemprop "name"} name]])

(defn comma-separate-str [coll]
  (if (nil? coll)
    "nothing"
    (if (= (count coll) 1)
      (first coll)
      (str (reduce #(str % ", " %2) (drop-last coll))
         ", and "
         (last coll)))))

(defn comma-separate [coll]
  (if (= (count coll) 1)
   coll
   (reduce into (concat
                 (map #(vec [% ", "])
                      (drop-last 2 coll))
                 (reduce #(vec [[ % ", and "] [%2]])
                         (take-last 2 coll))))))


(defn gathering-partial [data]
  [:section
   (headline (:synopsis data))
   (reduce into (p)
           [(comma-separate (map person (sort (:attendees data))))
            " experienced "
            (comma-separate (map film-citation (:media data)))
            ". They ate "
            (comma-separate-str (:food data))
            "."])
   (when-not (nil? (:notes data))
     [:div
      (p "This is what they discussed during, and between films:")
      (p (:notes data))])])

(defn login []
  (common "Login"
          [:meta {:name "description" :content "Login"}]
          [:section.pa3.pa5-ns
           (headline "Login")
           [:form.measure {:method "post" :action "/login"}
            [:div.mt3
              [:label.db.fw6.lh-copy.f6 {:for "email"} "Email address"]
              [:input.b.pa2.input-reset.ba.bg-transparent {:name "email" :type "text"}]]
            [:div.mt3
              [:label.db.fw6.lh-copy.f6 {:for "password"} "Password"]
              [:input.b.pa2.input-reset.ba.bg-transparent {:name "password" :type "password"}]]
            [:div.mt3
             [:input.b.ph3.pv2.input-reset.ba.b--black.bg-transparent.grow.pointer.f6.dib {:type "submit" :value "Login"}]]]]))

(defn not-found []
  (common "404"
          [:meta {:name "description" :content "You look lost."}]
          [:section.pa3.pa5-ns
           (headline 404)
           (p "The resource you requested was not found.")]))

(defn previously [data]
  (when-not (nil? data)
    (p [(link-to (str "/"
                      (if (:themes data)
                        "make-movies-great-again"
                        "gatherings")
                      "/"
                      (:date data))
                      "Previously...")])))

(defn home
  ([latest] (home latest nil))
  ([latest previous]
   (common "Our cinematic torture chamber."
           [:meta {:name "description" :content "This is the story of a friendship forged in food, film, and fear. It is pain, but it is also laughter. This is Chili Dog Night."}]
           [:article.pa3.pa5-ns
            (gathering-partial latest)
            (previously previous)])))

(defn gathering
  ([latest] (gathering latest nil))
  ([latest previous]
   (common (:date latest)
           [:meta {:name "description" :content (:synopsis latest)}]
           [:article.pa3.pa5-ns
            (gathering-partial latest)
            (previously previous)])))

(defn admin [a b]
  (common "Behind the Scenes"
          nil
          [:div
           [:section.pa3.pa5-ns {:id "app"}
            (headline "Which is worse?")
            [:form {:action "/api/media/vote"
                    :method "post"}
             [:div.mt3
              [:input {:type "radio"
                       :name "selected-media-id"
                       :value (:id a)
                       :checked true}]
              [:label.pl3 (:title a)]]
             [:div.mt3
              [:input {:type "radio"
                       :name "selected-media-id"
                       :value (:id b)}]
              [:label.pl3 (:title b)]]
             [:input {:type "hidden"
                      :name "media-a-id"
                      :value (:id a)}]
             [:input {:type "hidden"
                      :name "media-b-id"
                      :value (:id b)}]
             [:div.mt3
              [:input.b.ph3.pv2.input-reset.ba.b--black.bg-transparent.grow.pointer.f6.dib {:type "submit" :value "I've made my decision"}]]]]]))

(defn about []
  (common "About"
          [:meta {:name "description" :content "Somehow we got the part. Don't ask. This is Chili Dog Night."}]
          [:section.pa3.pa5-ns
           (headline "About")
           (p ["Chili Dog Night is a celebration of the worst kinds of moving images "
            "experienced in tandem with relatively unhealthy foods. "
            "The primary objective is to deconstruct and ridicule movies that don't have an "
            "excuse for their bad behavior. While the occasional obvious choice is "
            "consumed the real focus, and most infuriatingly painful kind of movie, is mainstream mediocrity."])
           (p ["As of this moment Chili Dog Night is "
            (person "Alex Sanchez")
            ", "
            (person "Jason Aumann")
            ", "
            (person "Greg Ryan")
            ", "
            (person "Jacob Dobner")
            ", "
            (person "Matt Beck")
            ", "
            (person "Colin Teal")
            ", and Kaia. They all hail from Seattle, and are slowly losing their minds one film at a time."])]))

(defn colophon []
  (common "Colophon"
          [:meta {:name "description" :content "We made it good with a beginning, middle, and end. This is Chili Dog Night."}]
          [:section.pa3.pa5-ns
           (headline "Colophon")
           (p ["This website was made possible by "
            (link-to "http://clojure.org/" "Clojure")
            " and "
            (link-to "https://github.com/clojure/clojurescript" "ClojureScript")
            ". Compilation of the application is facilitated by "
            (link-to "http://boot-clj.com/" "Boot")
            " and its myriad friends (e.g., "
            (link-to "https://github.com/adzerk-oss/boot-cljs" "boot-cljs")
            ", "
            (link-to "https://github.com/adzerk-oss/boot-reload" "boot-reload")
            ", and "
            (link-to "https://github.com/pandeiro/boot-http" "boot-http")
            "). Hypertext Markup Language (HTML) is generated via "
            (link-to "https://github.com/weavejester/hiccup" "Hiccup")
            ", and the Cascading Style Sheets (CSS) are grown with help from "
            (link-to "http://tachyons.io/" "Tachyons")
            ". The Really Simple Syndication (RSS) feed is created via "
            (link-to "https://github.com/yogthos/clj-rss" "clj-rss")
            "."])
           (p ["The domain name was purchased through "
            (link-to "https://www.namecheap.com/" "NameCheap")
            ". Hosting of the application is provided by "
            (link-to "https://www.heroku.com" "Heroku")
            ". The project source code is publicly available and stored on "
            (link-to "https://github.com/chili-dog-night/site" "GitHub")
            "."])]))

(defn ratings [media]
  (common "Ratings"
          [:meta {:name "description" :content "The films we have suffered through from worst to less worse."}]
          [:section.pa3.pa5-ns
           (headline "Ratings")
           (p ["The order below has been determined via random head to head voting. Each film is given an initial base rating that is updated per the "
            (link-to "https://en.wikipedia.org/wiki/Elo_rating_system" "Elo rating system")
            ". Adjustments to the ratings of winner and loser are based on the expected result versus the actual result for any given dual."])
           (p "The films are ordered from worst to least worst (best).")
           [:ol.f4.f3-ns.lh-copy
            (map #(vec [:li (film-citation %)]) media)]]))

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
