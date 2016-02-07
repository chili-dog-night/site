(ns chili-dog-night.data
  (:require [hiccup.element :as el]))

(def gatherings [{:date "2016/02/03"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "February 3rd, 2016: Jake's Birthday, War Room, and Divergent."
                  :food ["Cheese and Pepperoni Pizza from Pagliacci"
                         "Chips Ahoy! Chewy Chocolate Chip Cookies"
                         "Tillamook Chocolate Ice Cream"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Matt Beck"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "War Room" :uri "http://www.imdb.com/title/tt3832914/"}
                          {:title "Divergent" :uri "http://www.imdb.com/title/tt1840309/"}]
                  :notes [:p
                          (el/link-to "https://www.youtube.com/watch?v=wNNL9FIkF2E" "What if We Don't Want to Be Warm?")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=pXRviuL6vMY&feature=youtu.be" "Blurryface")
                          " and "
                          (el/link-to "https://www.youtube.com/watch?v=Y_rl4ZGdy34&feature=youtu.be" "White Privilege, II")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=XFxjy7f9RpY&feature=youtu.be" "Arden")
                          " "
                          (el/link-to "https://www.youtube.com/watch?v=1E9vj4WmHLM&feature=youtu.be" "Hayes")
                          ": "
                          (el/link-to "https://www.youtube.com/watch?v=jcOHdfbZ4Ok&feature=youtu.be" "genius")
                          [:br]
                          (el/link-to "http://www.affirmfilms.com/" "You are still watching...Blu-Ray")
                          " ("
                          (el/link-to "http://www.affirmfilms.com/resources/" "discussion guides")
                          ")"
                          [:br]
                          (el/link-to "http://www.metafilter.com/156532/freekesha" "#freekesha")
                          [:br]
                          (el/link-to "http://variety.com/2016/tv/news/joseph-fiennes-michael-jackson-casting-diversity-hollywood-whitewashing-1201690020/" "Joseph Fiennes as the King of Pop")
                          [:br]
                          (el/link-to "http://www.wired.com/2012/03/the-damning-backstory-behind-homeless-hotspots-at-sxswi/" "\"Acquiring Hobo...\"")
                          [:br]
                          (el/link-to "http://www.theverge.com/2016/1/28/10864034/windows-phone-is-dead" "Windows phone is dead")
                          [:br]
                          (el/link-to "http://www.rickyancey.com/books/the-5th-wave" "The 5th Wave, by Rick Yancey")
                          [:br]
                          (el/link-to "http://divergent.wikia.com/wiki/Abnegation" "The")
                          " "
                          (el/link-to "http://divergent.wikia.com/wiki/Candor" "Five")
                          " "
                          (el/link-to "http://divergent.wikia.com/wiki/Erudite" "Factions")
                          " "
                          (el/link-to "http://divergent.wikia.com/wiki/Dauntless" "of")
                          " "
                          (el/link-to "http://divergent.wikia.com/wiki/Amity" "Divergent")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Amusing_Ourselves_to_Death" "Amusing Ourselves to Death")
                          [:br]
                          (el/link-to "http://www.jamonexperience.com/en/" "A different kind of Beast Feast")
                          " (for Alex)"
                          [:br]
                          (el/link-to "http://www.beanogas.com/" "Possible remedy for Jason/Kaia")
                          [:br]
                          (el/link-to "https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#safe=off&q=super+bowl+commercials+2016" "87M results for \"Super Bowl Commercials 2016\"")
                          " ("
                          (el/link-to "http://www.cbsnews.com/media/9-super-bowl-commercials-already-getting-buzz/" "some tips for Greg when he finds himself around the proverbial watercooler")
                          ")"]}])
