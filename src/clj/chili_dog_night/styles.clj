(ns chili-dog-night.styles
  (:require [garden.def :refer [defstyles]]
            [garden.selectors :as selectors]))

(defstyles normalize
  [:body
   {:margin 0
    :padding 0}])

(defstyles layout
  [:body
   {:margin "0 auto"
    :max-width "780px"}])

(defstyles typography
  [:body
   {:font-family "Playfair Display"
    :font-size "18px"
    :font-variant-ligatures "common-ligatures"
    :text-rendering "optimizeLegibility"
    :-webkit-font-feature-settings "kern"
    :font-feature-settings "kern"
    :font-kerning "normal"}]
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

(defstyles screen
  normalize
  layout
  typography
  header
  footer)
