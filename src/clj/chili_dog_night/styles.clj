(ns chili-dog-night.styles
  (:require [garden.def :refer [defstyles]]
            [garden.selectors :as selectors]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [px px+]]))

(def ^:dynamic *media-query-mobile-large* (px 425))
(def ^:dynamic *media-query-tablet* (px 768))

(defstyles normalize
  [:body
   {:margin 0
    :padding 0}])

(defstyles layout
  [:body
   {:margin "0 auto"
    :max-width *media-query-tablet*}
   (at-media {:max-width (px+ *media-query-tablet* 30)}
     [:& {:margin "0 30px"}])
   (at-media {:max-width *media-query-mobile-large*}
     [:& {:margin "0 20px"}])])

(defstyles typography
  [:body
   {:font-family "Playfair Display"
    :font-size (px 18)
    :font-variant-ligatures "common-ligatures"
    :text-rendering "optimizeLegibility"
    :-webkit-font-feature-settings "kern"
    :font-feature-settings "kern"
    :font-kerning "normal"}
   (at-media {:max-width *media-query-tablet*}
     [:& {:font-size (px 16)}])
   (at-media {:max-width *media-query-mobile-large*}
     [:& {:font-size (px 12)}])]
  [:a
   {:font-style "italic"}]
  [:p
   {:line-height "1.75em"}])

(defstyles header
  [:header
   {:margin-bottom "2em"
    :text-align "center"}
   [:h1
    {:font-style "italic"
     :font-weight 700
     :letter-spacing "0.12rem"
     :margin-bottom "0.25em"}
    [:a
     {:color "inherit"
      :text-decoration "none"}]]
   [:ul
    {:margin 0
     :padding 0}
    [:li
     {:display "inline"}
     [(selectors/& (selectors/not (selectors/first-child)))
      {:margin-left "1em"}]]]])

(defstyles footer
  [:footer
   {:margin-top "2em"
    :text-align "center"}])

(defstyles forms
  [:form
   [:div
    {:padding-top ".25em"
     :padding-bottom ".25em"}]
   [:button
    {:margin-top "2.5em"}]])

(defstyles screen
  normalize
  layout
  typography
  header
  footer
  forms)
