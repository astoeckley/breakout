(ns breakout.css
  (:require [garden.def :refer [defstylesheet]]))

(defstylesheet screen
  {:output-to "resources/public/css/screen.css"}
  [[:body {:background-image "url(/images/gray2.png)"
           :background-size "8px"}]

   [:#app {:margin "0 auto"
           :width "1010px"}]

   [:h1 {:font-size "3rem"
         :font-family "Baloo Da, Impact, sans-serif"
         :margin-top "0"
         :margin-bottom "-20px"
         :color "#2222200"
         :text-shadow "3px 3px #ddd"}]

   [:.fill--black {:fill "#222200"}]
   [:.fill--gray1 {:fill "#444444"}]
   [:.fill--gray2 {:fill "#888888"}]
   [:.fill--gray3 {:fill "#bbbbbb"}]
   [:.fill--white {:fill "#ffffee"}]

   [:.stroke--black {:stroke "#222200" :stroke-width "2px"}]
   [:.stroke--gray1 {:stroke "#444444" :stroke-width "2px"}]
   [:.stroke--gray2 {:stroke "#888888" :stroke-width "2px"}]
   [:.stroke--gray3 {:stroke "#bbbbbb" :stroke-width "2px"}]
   [:.stroke--white {:stroke "#ffffee" :stroke-width "2px"}]
   [:.stroke--dashed {:stroke-dasharray "5, 5"}]

   [:.fill--color1 {:fill "#d685c5"}]
   [:.fill--color2 {:fill "#4a90cf"}]
   [:.fill--color3 {:fill "#1fa8a7"}]
   [:.fill--color4 {:fill "#37cd81"}]
   [:.fill--color5 {:fill "#dddb36"}]])
