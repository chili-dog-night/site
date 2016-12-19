(ns chili-dog-night.data
  (:require [chili-dog-night.views :refer [link-to]]))


(def make-movies-great-again [{:date "2016/08/17"
                               :address ""
                               :synopsis "August 17th, 2016: Cult Films - Martha Marcy May Marlene, The Invitation."
                               :themes ["Cult Films"]
                               :food ["Spaghetti"]
                               :attendees ["Alex Sanchez"
                                          "Jason Aumann"
                                          "Greg Ryan"
                                          "Jacob Dobner"
                                          "Colin Teal"]
                               :media [{:title "Martha Marcy May Marlene" :uri "http://www.imdb.com/title/tt1441326/"}
                                       {:title "The Invitation" :uri "http://www.imdb.com/title/tt2400463/"}]
                               :notes [(link-to "https://en.wikipedia.org/wiki/Elizabeth_Olsen" "Elizabeth Olsen")
                                       " and "
                                       (link-to "https://en.wikipedia.org/wiki/John_Hawkes_(actor)" "John Hawkes")
                                       [:br]
                                       (link-to "https://en.wikipedia.org/wiki/John_Carroll_Lynch" "John Carroll Lynch")]}])

(def gatherings [{:date "2016/12/14"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "December 14th, 2016: Chili Dogs, Mr. Right, and Yoga Hosers."
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :food ["Chili Dogs"]
                  :media [{:title "Mr. Right" :uri "http://www.imdb.com/title/tt2091935/"}
                          {:title "Yoga Hosers" :uri "http://www.imdb.com/title/tt3838992/"}]
                  :notes [(link-to "https://youtu.be/VD1OpDdGyV4" "Wachet Auf, Ruft Uns Die Stimme")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Johann_Sebastian_Bach" "Johann Sebastian Bach")
                          ", and the "
                          (link-to "https://en.wikipedia.org/wiki/Canon_(music)" "canon")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/King_Arthur" "King Arthur")
                          ", the "
                          (link-to "http://www.arthurian-legend.com/" "legend")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Excalibur_(film)" "Exaclibur")
                          [:br]
                          (link-to "http://www.nytimes.com/2016/12/14/business/economy/fed-interest-rates-janet-yellen.html" "Interest Rates")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Get_Out_(film)" "Get")
                          " "
                          (link-to "https://www.youtube.com/watch?v=sRfnevzM9kQ" "Out")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Sam_Rockwell" "Sam Rockwell")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/New_Orleans" "New Orleans")
                          ", and its "
                          (link-to "https://en.wikipedia.org/wiki/Mercedes-Benz_Superdome" "Superdome")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Salish_Sea_human_foot_discoveries" "Salish Sea human foot discoveries")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Justin_Long" "Justin Long")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Max_Landis" "Max Landis")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Lily-Rose_Depp" "Lily-Rose Depp")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Harley_Quinn_Smith" "Harley Quinn Smith")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Sofia_Coppola" "Sofia Coppola")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=F-eMt3SrfFU" "Dunkirk")]}
                 {:date "2016/12/07"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "December 7th, 2016: Happy Christmas, and 12 Dates of Christmas."
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Happy Christmas" :uri "http://www.imdb.com/title/tt2955096/"}
                          {:title "12 Dates of Christmas" :uri "http://www.imdb.com/title/tt1846442/"}]
                  :notes [(link-to "http://www.imdb.com/name/nm0447695/" "\"The matron saint of basic bitches\"")
                          [:br]
                          (link-to "http://scrappylittlenobody.com/" "Scrappy Little Nobody")
                          ", "
                          (link-to "https://www.youtube.com/watch?v=cmSbXsFE3l8" "Cups")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Mumblecore" "Mumblecore")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt1336617/" "Cyrus")
                          ", and The "
                          (link-to "https://en.wikipedia.org/wiki/Mark_Duplass" "Duplass")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Jay_Duplass" "Brothers")
                          [:br]
                          (link-to "http://www.imdb.com/name/nm0005442/" "Amy Smart")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Groundhog_Day_(film)" "Groundhog Day")
                          [:br]
                          (link-to "http://www.hamiltonelectors.com/" "Hamilton Electors")
                          ", the "
                          (link-to "https://en.wikipedia.org/wiki/Electoral_College_(United_States)" "Electoral College")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Federalist_No._68" "Federalist No. 68")
                          [:br]
                          (link-to "https://en.m.wikipedia.org/wiki/National_Popular_Vote_Interstate_Compact" "National Popular Vote Interstate Compact")]}
                 {:date "2016/11/30"
                  :address "12283 Densmore Ave N, Seattle, WA 98103, USA"
                  :synopsis "November 30th, 2016: Domino's Pizza, Nine Lives, and Cell."
                  :food ["Domino's Pizza"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"]
                  :media [{:title "Nine Lives" :uri "http://www.imdb.com/title/tt4383594/"}
                          {:title "Cell" :uri "http://www.imdb.com/title/tt0775440/"}]}
                 {:date "2016/11/23"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "November 23rd, 2016: Chili Dogs, and The Trust."
                  :food ["Chili Dogs"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Kaia"]
                  :media [{:title "The Trust" :uri "http://www.imdb.com/title/tt3733774/"}]
                  :notes [(link-to "http://www.mercurynews.com/2016/11/16/for-thanksgiving-families-struggle-to-put-aside-election-politics/" "Family Strife at Thanksgiving")
                          [:br]
                          (link-to "http://www.salon.com/2014/08/08/how_one_man_destroyed_the_food_network_guy_fieri_has_made_culinary_tv_into_a_viewers_hell/" "Guy Fieri")]}
                 {:date "2016/11/16"
                  :address "12283 Densmore Ave N, Seattle, WA 98103, USA"
                  :synopsis "November 16th, 2016: Alice Through the Looking Glass, and Money Monster."
                  :food ["Pepperidge Farm Boston Cream Pie Milano Melts"
                         "Pepperidge Farm Double Chocolate Milano"
                         "Pepperidge Farm Salted Caramel Milano"
                         "Frozen Fruit Bars"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"]
                  :media [{:title "Alice Through the Looking Glass" :uri "http://www.imdb.com/title/tt2567026/"}
                          {:title "Money Monster" :uri "http://www.imdb.com/title/tt2241351/"}]
                  :notes [(link-to "https://www.youtube.com/watch?v=eNykS4VlnwE" "Mad Max: Fury Road Black and Chrome")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Steve_Bannon" "Steve")
                          " "
                          (link-to "http://www.nytimes.com/2016/11/15/us/politics/stephen-bannon-breitbart-words.html" "Bannon")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Donald_Trump" "Donald Trump")]}
                 {:date "2016/10/12"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "October 12th, 2016: Chili Dogs, Warcraft, and Hillary's America."
                  :food ["Chili Dogs"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Warcraft" :uri "http://www.imdb.com/title/tt0803096/"}
                          {:title "Hillary's America" :uri "http://www.imdb.com/title/tt5646136/"}]
                  :notes [(link-to "http://thebaffler.com/blog/workaday-woes-whatley" "Workaday Woes")
                          " and the "
                          (link-to "http://thebaffler.com/" "Baffler")
                          [:br]
                          "\""
                          (link-to "https://www.washingtonpost.com/politics/trump-recorded-having-extremely-lewd-conversation-about-women-in-2005/2016/10/07/3b9ce776-8cb4-11e6-bf8a-3d26847eeed4_story.html" "Grab them by the...")
                          "\""
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Duncan_Jones" "Duncan Jones")
                          [:br]
                          "\""
                          (link-to "http://www.urbandictionary.com/define.php?term=For%20The%20Horde!" "For the Horde!")
                          "\""
                          [:br]
                          (link-to "http://wowwiki.wikia.com/wiki/Murloc" "Murloc")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Dinesh_D%27Souza" "Dinesh D'Souza")]}
                 {:date "2016/09/28"
                  :address "12283 Densmore Ave N, Seattle, WA 98133, USA"
                  :synopsis "September 28th, 2016: The Invasion, and Seventh Son."
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"]
                  :media [{:title "The Invasion" :uri "http://www.imdb.com/title/tt0427392/"}
                          {:title "Seventh Son" :uri "http://www.imdb.com/title/tt1121096/"}]
                  :notes ["\""
                          (link-to "https://www.youtube.com/watch?v=MrttEZDpDE8" "Tusk")
                          "\""]}
                 {:date "2016/08/24"
                  :address "12283 Densmore Ave N, Seattle, WA 98133, USA"
                  :synopsis "August 24th, 2016: Guacamole, and God's Not Dead 2."
                  :food ["Greg's Guacamole"
                         "M&M Cookies"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Matt Beck"
                              "Colin Teal"]
                  :media [{:title "God's Not Dead 2" :uri "http://www.imdb.com/title/tt4824308/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Parenting" "Parenthood")
                          [:br]
                          (link-to "http://dnd.wizards.com/" "Dungeons")
                          " "
                          (link-to "http://theadventurezone.tumblr.com/" "&")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Dungeon_Master%27s_Guide" "Dragons")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Tabletop_game" "Tabletop Games")
                          [:br]
                          "The "
                          (link-to "https://en.wikipedia.org/wiki/DSM-5" "DSM-5")
                          " and the end of "
                          (link-to "http://www.slate.com/articles/health_and_science/medical_examiner/2013/05/autism_spectrum_diagnoses_the_dsm_5_eliminates_asperger_s_and_pdd_nos.html" "Asperger's")
                          [:br]
                          (link-to "https://www.amazon.com/dp/B012N992EK" "Listen Liberal: Or, What Ever Happened to the Party of the People?")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/H._P._Lovecraft" "H.P. Lovecraft")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=Yjtm_Y1h2eI" "Tim's Cook Off")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Newsboys" "False Idols")]}
                 {:date "2016/08/10"
                  :address "12283 Densmore Ave N, Seattle, WA 98133, USA",
                  :synopsis "August 10th, 2016: Ballard Pizza Company, Criminal, and Wild Wild West."
                  :food ["Ballard Pizza Company Pepperoni Pizza"
                         "Ballard Pizza Company Cheese Pizza"
                         "Pepperidge Farm Dessert Shop Cookies S'mores"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"]
                  :media [{:title "Criminal" :uri "http://www.imdb.com/title/tt3014866/"}
                          {:title "Wild Wild West" :uri "http://www.imdb.com/title/tt0120891/"}]
                  :notes [(link-to "https://youtu.be/6ZlbahhoEIo" "\"Wow\"")
                          " by "
                          (link-to "https://en.wikipedia.org/wiki/Beck" "Beck")
                          [:br]
                          (link-to "http://www.no-mans-sky.com/" "No Man's Sky")
                          " and "
                          (link-to "https://en.wikipedia.org/wiki/Procedural_generation" "procedural generation")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/JFK_(film)" "JFK")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Nuclear_weapons_and_the_United_States" "Nuclear weapons")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Kenneth_Branagh" "Kenneth Branagh")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Steampunk" "Steampunk")
                          " and the "
                          (link-to "http://whitenoise.kinja.com/how-wild-wild-west-helped-create-steampunk-1692973389" "Wild Wild West")
                          [:br]
                          "The "
                          (link-to "https://en.wikipedia.org/wiki/United_States_Secret_Service" "Secret Service")
                          ": its "
                          (link-to "http://nowiknow.com/abraham-lincoln-created-the-secret-service-the-day-he-was-shot/" "past")
                          " and "
                          (link-to "https://www.washingtonpost.com/news/post-politics/wp/2014/10/01/a-shortlist-of-recent-secret-service-scandals/" "present")]}
                 {:date "2016/08/03"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "August 3rd, 2016: Pudge Bros Pizza, Term Life, and The Hot Flashes."
                  :food ["Pudge Bros Cheese Pizza"]
                  :attendees ["Alex Sanchez"
                              "Jacob Dobner"
                              "Matt Beck"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Term Life" :uri "http://www.imdb.com/title/tt2978102/"}
                          {:title "The Hot Flashes" :uri "http://www.imdb.com/title/tt2201251/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Chernobyl_disaster" "Chernobyl")
                          ", "
                          (link-to "https://green.uw.edu/blog/2015-11/history-uws-own-nuclear-reactor" "nuclear reactors")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Hanford_Site" "Hanford")
                          [:br]
                          (link-to "http://pitchfork.com/news/66200-listen-to-grimes-new-song-medieval-warfare-from-suicide-squad/" "Medieval Warfare")
                          ", and "
                          (link-to "https://www.rottentomatoes.com/m/suicide_squad_2016" "Suicide Squad")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Transgender" "Transgender")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Gender_role" "Gender")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Feminism" "Feminism")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Troll_(Middle-earth)#Cave_Trolls" "Cave Trolls")
                          [:br]
                          (link-to "https://www.google.com/intl/en_us/chromecast/" "Chromecast")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Term_life_insurance" "Term life insurance")]}
                 {:date "2016/07/27"
                  :address "12283 Densmore Ave N, Seattle, WA 98133, USA",
                  :synopsis "July 27th, 2016: Pizza, I Am Wrath, and Allegiant."
                  :food ["Little Caesars Cheese Pizza"
                         "Little Caesars Pepperoni Pizza"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "I Am Wrath" :uri "http://www.imdb.com/title/tt3212232/"}
                          {:title "Allegiant" :uri "http://www.imdb.com/title/tt3410834/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Solipsism" "Solipsism")
                          ", "
                          (link-to "http://www.zoo.org/zootunes" "Zoo Tunes")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/%22Weird_Al%22_Yankovic" "Weird Al")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=qQVlGrwG9yo" "Monster Factory")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Vice_Principals" "Vice Principals")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Review_(TV_series)" "Review")
                          " w/"
                          (link-to "https://en.wikipedia.org/wiki/Andy_Daly" "Andy Daly")
                          " courtesy of "
                          (link-to "https://www.google.com/search?q=insufferable+hulu+ads" "Hulu")
                          [:br]
                          "Being "
                          (link-to "http://zap2it.com/2016/02/john-travolta-hair-10-styles-handsome-creepy/" "John Travolta")
                          [:br]
                          (link-to "https://www.google.com/search?q=pipelines&safe=off&tbm=isch" "Pipelines")
                          [:br]
                          (link-to "https://twitter.com/Miles_Teller/status/753784939481403392" "Miles Teller")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Veronica_Roth" "Veronica Roth")
                          [:br]
                          (link-to "https://breakinggeek.files.wordpress.com/2015/07/jurassic-park-mr-dna.png" "\"Ginomics\"")]}
                 {:date "2016/07/20"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "July 20th, 2016: 13 Hours, and How to Be Single."
                  :food ["Choco Chip Oreo Cookies"
                         "Klondike Cookie Dough Swirl"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "13 Hours" :uri "http://www.imdb.com/title/tt4172430/"}
                          {:title "How to Be Single" :uri "http://www.imdb.com/title/tt1292566/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/2016_Republican_National_Convention" "The Republican National Convention")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Mike_Pence" "Mike Pence")
                          ", and "
                          (link-to "http://www.nytimes.com/2016/07/23/us/politics/rnc-ratings-trump.html" "who cares")
                          "?"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Stranger_Things_(TV_series)" "Stranger Things")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Garry_Marshall" "Garry Marshall")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/The_Divergent_Series:_Allegiant" "Allegiant")
                          " part two "
                          (link-to "http://variety.com/2016/film/news/divergent-series-ascendant-1201818694/" "ascends the cinema")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/2012_Benghazi_attack" "Benghazi")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Jason_Mantzoukas" "Jason Mantzoukas")
                          ", "
                          (link-to "http://www.earwolf.com/show/how-did-this-get-made/" "How Did This Get Made?")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/The_League" "The League")
                          [:br]
                          (link-to "http://www.esri.com/products/maps-we-love/death-grand-canyon" "Death in the Grand Canyon")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/The_Invitation_(2015_film)" "The Invitation")]}
                 {:date "2016/07/13"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "July 13th, 2016: Chili Dogs, London Has Fallen, and Miracles from Heaven."
                  :food ["Chili Dogs"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Kaia"]
                  :media [{:title "London Has Fallen" :uri "http://www.imdb.com/title/tt3300542/"}
                          {:title "Miracles from Heaven" :uri "http://www.imdb.com/title/tt4257926/"}]}
                 {:date "2016/07/06"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "July 6th, 2016: Girl Meets World, The Scorch Trials, and Heaven's Door."
                  :food ["Lay's Flavor Mix Variety Pack"
                         "Keebler E.L. Fudge Original Cookies"
                         "Keebler Chips Deluxe Rainbow Chocolate Chip Cookies with M&Ms"
                         "Keebler Fudge Stripes Original Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Girl Meets World" :uri "http://www.imdb.com/title/tt2543796/"}
                          {:title "The Scorch Trials" :uri "http://www.imdb.com/title/tt4046784/"}
                          {:title "Heaven's Door" :uri "http://www.imdb.com/title/tt2321269/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Star_Ocean:_Integrity_and_Faithlessness" "Star Ocean")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Metal_Gear_Solid_V:_The_Phantom_Pain" "The Phantom Pain")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/The_Witcher_3:_Wild_Hunt" "Wild Hunt")
                          [:br]
                          (link-to "http://www.uefa.com/uefaeuro/season=2016/teams/team=47/index.html" "Germany")
                          " vs. "
                          (link-to "http://www.uefa.com/uefaeuro/season=2016/teams/team=43/index.html" "France")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Feudalism" "Feudalism")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Serfdom" "Serfdom")
                          [:br]
                          (link-to "http://www.seattletimes.com/business/this-mold-house-decaying-home-too-dangerous-to-enter-sparks-insane-bidding/" "West Seattle teardown")
                          " and "
                          (link-to "http://www.seattletimes.com/business/seattles-devilish-new-home-price-record-666000/" "Satan's housing market")
                          [:br]
                          (link-to "http://www.gustavus.com/heidi/scrim.html" "Scrimshaw")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Petyr_Baelish" "Lord Baelish")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Steven_Spielberg" "Spielberg")
                          ": "
                          (link-to "http://www.imdb.com/title/tt0107290/" "Jurassic Park")
                          ", "
                          (link-to "http://www.imdb.com/title/tt0083866/" "E.T.")
                          ", "
                          (link-to "http://www.imdb.com/title/tt0983193/" "The Adventures of Tintin")
                          ", and "
                          (link-to "http://www.imdb.com/title/tt3691740/" "The B.F.G")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt0401729/" "John Carter")
                          [:br]
                          (link-to "https://www.christianmingle.com/" "Christian")
                          " "
                          (link-to "http://www.relevantmagazine.com/life/whole-life/why-arent-christians-funny" "humor")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Religiosity_and_intelligence" "intelligence")
                          [:br]
                          "\""
                          (link-to "https://www.youtube.com/watch?v=S_OTz-lpDjw" "God's not dead he's surely alive...")
                          "\""]}
                 {:date "2016/06/29"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "June 29th, 2016: A Matter of Faith, and Agent Cody Banks: Destination London."
                  :attendees ["Alex Sanchez"
                              "Jacob Dobner"
                              "Jason Aumann"
                              "Matt Beck"
                              "Kaia"]
                  :media [{:title "A Matter of Faith" :uri "http://www.imdb.com/title/tt0358349/"}
                          {:title "Agent Cody Banks: Destination London" :uri "http://www.imdb.com/title/tt2587914/"}]}
                 {:date "2016/06/22"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "June 22nd, 2016: Girl Meets World, The Giver, and Guy's Grocery Games."
                  :food ["Pringles Pizza"
                         "Trader Joe's Ghost Pepper Potato Chips"
                         "Keebler Grasshopper Cookies"
                         "Keebler Fudge Stripes Original Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Girl Meets World" :uri "http://www.imdb.com/title/tt2543796/"}
                          {:title "The Giver" :uri "http://www.imdb.com/title/tt0435651/"}
                          {:title "Guy's Grocery Games" :uri "http://www.imdb.com/title/tt3165150/"}]
                  :notes [(link-to "http://vignette4.wikia.nocookie.net/girlmeetsworld/images/1/10/Yearbook13.jpg/revision/latest?cb=20150729011804" "Goth Meets World")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=UL_EXAyGCkw" "Geronimo")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Tim_%26_Eric%27s_Bedtime_Stories" "Bedtime Stories")
                          [:br]
                          (link-to "http://www.dreamingwithjeff.com/" "Sleeping Tapes")
                          [:br]
                          (link-to "http://knowyourmeme.com/memes/people/taylor-swift" "Taylor")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Taylor_Swift" "Swift")
                          " "
                          (link-to "https://www.google.com/search?q=taylor+swift+backlash" "backlash")
                          [:br]
                          (link-to "http://ihatethisswampcalledhouston.blogspot.com/" "Houston")
                          [:br]
                          "The "
                          (link-to "http://www.nytimes.com/1981/07/11/movies/robert-altman-sells-studio-for-2.3-million.html" "sale")
                          " of "
                          (link-to "https://en.wikipedia.org/wiki/Robert_Altman" "Altman's")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Lionsgate" "Lionsgate")
                          [:br]
                          (link-to "http://ihateseattle.com/" "Seattle")
                          [:br]
                          (link-to "http://www.almanac.com/content/strawberry-moon-june-full-moon-phases-2016" "Strawberry Moon")]}
                 {:date "2016/06/15"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "June 15th, 2016: Chili Dogs, Girl Meets World, Get a Job, and Big Fat Liar."
                  :food ["Chili Dogs"
                         "Pringles Jalapeño"
                         "Keebler E.L. Fudge Original Cookies"
                         "Keebler Jif Peanut Butter Cookies"
                         "Keebler Fudge Stripes Original Cookies"]
                  :attendees ["Alex Sanchez"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Girl Meets World" :uri "http://www.imdb.com/title/tt2543796/"}
                          {:title "Get a Job" :uri "http://www.imdb.com/title/tt1468846/"}
                          {:title "Big Fat Liar" :uri "http://www.imdb.com/title/tt0265298/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Electronic_Entertainment_Expo_2016" "E3")
                          ": "
                          (link-to "http://www.ign.com/wikis/playstation-4/PS4_vs_PlayStation_NEO_Comparison_Chart" "NEO")
                          ", "
                          (link-to "http://www.theverge.com/2016/6/13/11890842/microsoft-xbox-project-scorpio-virtual-reality-e3-2016" "Scorpio")
                          ", and "
                          (link-to "https://www.youtube.com/watch?v=Ze05xdORvYs" "The Legend of Zelda: Breath of the Wild")
                          [:br]
                          (link-to "https://storify.com/case_face/a-trump-rally-in-greensboro-anger-in-here-is-palpa" "Trump 2016")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/AR-15" "AR-15")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/2016_Orlando_nightclub_shooting" "Orlando")
                          " and "
                          (link-to "https://en.wikipedia.org/wiki/Sandy_Hook_Elementary_School_shooting" "Sandy Hook")
                          [:br]
                          (link-to "http://www.0s-1s.com/neujorker/" "The Neu Jorker")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Marc_Maron" "Marc Maron")
                          [:br]
                          "Do you even "
                          (link-to "https://youtu.be/36PNDDiRNMs" "smoke")
                          "?"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Anna_Kendrick" "Anna Kendrick")
                          " vs. "
                          (link-to "https://en.wikipedia.org/wiki/Alison_Brie" "Alison Brie")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Frankie_Muniz" "Frankie")
                          " "
                          (link-to "https://twitter.com/brendohare/status/711756445717495808" "Muniz")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Amanda_Bynes" "Amanda")
                          " "
                          (link-to "http://www.people.com/article/amanda-bynes-30th-birthday-healthier-lifestyle" "Bynes")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Paul_Giamatti" "Paul")
                          " "
                          (link-to "http://villains.wikia.com/wiki/Marty_Wolf" "Giamatti")
                          [:br]
                          (link-to "https://youtu.be/mb1DcB-zGSU" "Wrangler")
                          " and "
                          (link-to "https://www.youtube.com/watch?v=BfR5O2PXzfc" "America's Got Talent")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Astralwerks" "Astralwerks")
                          ", "
                          (link-to "http://www.aircheology.com/" "Air")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/The_Smiths" "The Smiths")]}
                 {:date "2016/06/08"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "June 8th, 2016: Christian Mingle, and Playing for Keeps."
                  :food ["Keebler E.L. Fudge Original Cookies"
                         "Keebler Chips Deluxe Rainbow Chocolate Chip Cookies with M&Ms"
                         "Keebler Fudge Stripes Original Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Christian Mingle" :uri "http://www.imdb.com/title/tt3398066/"}
                          {:title "Playing for Keeps" :uri "http://www.imdb.com/title/tt1540128/"}]
                  :notes [(link-to "https://www.amazon.com/b?node=10667898011" "Amazon Dash Button")
                          [:br]
                          (link-to "https://www.jdate.com/" "JDate")
                          " and "
                          (link-to "https://www.christianmingle.com/" "Christian Mingle")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Stephen_Tobolowsky" "Stephen Tobolowsky")
                          [:br]
                          (link-to "https://www.buzzfeed.com/katiejmbaker/heres-the-powerful-letter-the-stanford-victim-read-to-her-ra?utm_term=.wslE7NlJr#.ecLyx6RvV" "Brock")
                          " "
                          (link-to "http://heavy.com/news/2016/06/brock-turner-father-dad-dan-turner-full-letter-statement-stanford-rapist/" "Turner")
                          [:br]
                          (link-to "http://www.imdb.com/name/nm0339460/" "Judy Greer")
                          " and "
                          (link-to "http://www.imdb.com/name/nm0000235/" "Uma Thurman")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Real_World:_Seattle_(2016)" "Real World: Seattle")
                          [:br]
                          (link-to "https://youtu.be/ZfmNfoNrkIE" "Blurred Lines")
                          ", or "
                          (link-to "https://en.wikipedia.org/wiki/Music_plagiarism" "Infringement")
                          ": "
                          (link-to "https://en.wikipedia.org/wiki/Robin_Thicke" "Robin Thicke")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Pharrell_Williams" "Pharrell Williams")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Sam_Smith_(singer)" "Sam Smith")]}
                 {:date "2016/06/01"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "June 1st, 2016: The Do-Over, and Gods of Egypt."
                  :food ["Keebler Jif Peanut Butter Cookies"
                         "Keebler Chips Deluxe Rainbow Chocolate Chip Cookies with M&Ms"
                         "Keebler Fudge Stripes Original Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "The Do-Over" :uri "http://www.imdb.com/title/tt4769836/"}
                          {:title "Gods of Egypt" :uri "http://www.imdb.com/title/tt2404233/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Haller_Lake,_Seattle" "Haller Lake")
                          [:br]
                          (link-to "https://answers.yahoo.com/question/index?qid=20110622150204AAyy7B5" "What's that smell?")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt3799694/" "The Nice Guys")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/David_Spade" "David Spade")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Natasha_Leggero" "Natasha Leggero's")
                          " "
                          (link-to "https://www.youtube.com/playlist?list=PLmLMM7D7XLUX8EIwf33eqGuH5aeDPdG3I" "Tubbin' With Tash")
                          [:br]
                          (link-to "http://www.thewrap.com/johnny-depp-is-being-blackmailed-by-amber-heard-heres-how-i-know-guest-column/" "Amber Heard")
                          ", "
                          (link-to "http://gawker.com/leaked-texts-reveal-more-than-just-specific-details-of-1780357241" "Johnny Depp")
                          ", "
                          (link-to "http://www.people.com/article/johnny-depp-kate-moss-amber-heard-relationship" "Kate Moss")
                          ", and "
                          (link-to "http://www.salon.com/2016/06/03/the_end_of_hollywood_alice_through_the_looking_glass_is_yet_another_big_budget_flop_and_that_could_mean_a_disastrous_year_for_studios/" "Alice Through the Looking Glass")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt0360486/" "Constantine")
                          " with "
                          (link-to "https://en.wikipedia.org/wiki/Gavin_Rossdale" "Gavin Rossdale")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Vin_Diesel" "Vin Diesel")
                          ", "
                          (link-to "http://www.imdb.com/title/tt1618442/trivia?item=tr2649340" "Melkor")
                          ", and the "
                          (link-to "https://en.wikipedia.org/wiki/Peter_principle" "Peter principle")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Maria_Bamford" "Maria Bamford's")
                          " "
                          (link-to "https://www.netflix.com/title/80046193" "Lady Dynamite")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt2306299/" "Vikings")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=2Rxoz13Bthc" "Warcraft")
                          " (not "
                          (link-to "http://us.battle.net/wow/en/" "that")
                          " one)"]}
                 {:date "2016/05/25"
                  :address "94th Ave NE, Bothell, WA 98011, USA",
                  :synopsis "May 25th, 2016: Pizza, Kindergarten Cop 2, and Hot Pursuit."
                  :food ["Papa John's Pizza"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"]
                  :media [{:title "Kindergarten Cop 2" :uri "http://www.imdb.com/title/tt4763168/"}
                          {:title "Hot Pursuit" :uri "http://www.imdb.com/title/tt2967224/"}]}
                 {:date "2016/05/18"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "May 18th, 2016: Chili Dogs, We Are Your Friends, and Ride."
                  :food ["Chili Dogs"
                         "Oreo Triple Double Chocolate Sandwich Cookies"
                         "Peanut M&M's"
                         "Chips Ahoy! Original Chocolate Chip Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jacob Dobner"
                              "Michael Adams"
                              "Colin Teal"]
                  :media [{:title "We Are Your Friends" :uri "http://www.imdb.com/title/tt3787590/"}
                          {:title "Ride" :uri "http://www.imdb.com/title/tt1930463/"}]
                  :notes [(link-to "http://www.imdb.com/title/tt0298814/" "The Core")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/DJ_Qualls" "Donald Joseph Qualls")
                          [:br]
                          (link-to "http://www.dailymail.co.uk/news/article-2745169/Zombie-chic-Indonesian-village-Toraja-s-bizarre-annual-ritual-Ceremony-Cleaning-Corpses-MaiNene.html" "Ma'nene")
                          ", or the "
                          (link-to "https://www.youtube.com/watch?v=CGlLs3Rnwg4" "Ceremony of Cleaning Corpses")
                          " (via "
                          (link-to "https://www.instagram.com/p/BFTEHxyIVaU/?taken-by=natgeo" "National Geographic")
                          ")"
                          [:br]
                          "The global ambition of action remakes, e.g. "
                          (link-to "http://www.imdb.com/title/tt1234721/" "Robocop")
                          ", "
                          (link-to "http://www.imdb.com/title/tt2058673/" "Point Break")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt2545118/" "Blackfish")
                          ", and "
                          (link-to "http://www.imdb.com/title/tt1313104/" "The Cove")
                          [:br]
                          (link-to "https://youtu.be/8361stZ8n0w" "Foxcatcher")
                          ", "
                          (link-to "https://www.youtube.com/watch?v=WZczesrBFRA" "Team Foxcatcher")
                          ", and "
                          (link-to "http://espn.go.com/30for30/film?page=theprinceofpennsylvania" "The Prince of Pennsylvania")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/San_Fernando_Valley" "San Fernando Valley")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/French_house" "French house")
                          ", and other "
                          (link-to "https://en.wikipedia.org/wiki/Phencyclidine" "drugs")
                          [:br]
                          "\"We'll always have "
                          (link-to "https://en.wikipedia.org/wiki/Paris_Las_Vegas" "the Paris")
                          "\""
                          [:br]
                          (link-to "https://www.caesars.com/caesars-palace/restaurants/bacchanal-buffet" "Bacchanal")
                          [:br]
                          (link-to "http://www.nytimes.com/2016/05/14/us/us-will-step-up-deportations-focusing-on-central-americans.html" "Obama escalates deportations")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Luke_Wilson" "Luke Wilson")
                          [:br]
                          (link-to "http://www.newyorker.com/" "The New Yorker")
                          ": "
                          (link-to "http://laist.com/2016/05/17/la_times_music_critic_out_after_500.php" "Sasha Frere-Jones")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/David_Remnick" "David Remnick")]}
                 {:date "2016/05/11"
                  :address "9226 1st Ave NW, Seattle, WA 98117, USA",
                  :synopsis "May 11th, 2016: Chili, Missed Call, Point Break, and Ratter."
                  :food ["Homemade Turkey Chili"
                         "Pirate's Booty Aged White Cheddar"
                         "Dessert Shop Mint Chocolate Brownie Cookies"
                         "Double Chocolate Nantucket Dark Chocolate Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Katie Sauro"
                              "Colin Teal"]
                  :media [{:title "Missed Call" :uri "http://www.imdb.com/title/tt4125752/"}
                          {:title "Point Break" :uri "http://www.imdb.com/title/tt2058673/"}
                          {:title "Ratter" :uri "http://www.imdb.com/title/tt3836512/"}]
                  :notes [(link-to "http://www.bloomberg.com/politics/articles/2016-05-04/gop-establishment-nightmare-ted-cruz-2020" "2020")
                          [:br]
                          (link-to "http://www.pokeylafarge.net/" "Pokey Lafarge")
                          " and "
                          (link-to "http://www.thecactusblossoms.com/music.html" "The Cactus Blossoms")
                          [:br]
                          "The unique simplicity of "
                          (link-to "https://en.wikipedia.org/wiki/Seinfeld" "Seinfeld")
                          ", and its modern analogue "
                          (link-to "https://en.wikipedia.org/wiki/It%27s_Always_Sunny_in_Philadelphia" "It's Always Sunny in Philadelphia")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Brad_Bird" "Brad Bird")
                          [:br]
                          (link-to "http://www.modernlibrary.com/top-100/100-best-nonfiction/" "The Reader's List")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt0102685/" "Point Break")
                          [:br]
                          (link-to "http://www.junkiexl.com/" "Junkie XL")
                          ", "
                          (link-to "http://www.hans-zimmer.com/" "Hans Zimmer")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/James_Horner" "James Horner")
                          [:br]
                          (link-to "https://youtu.be/qerpkmHGvuE" "Vice")
                          " "
                          (link-to "https://youtu.be/bPs33txZ5G0" "Principals")
                          " from "
                          (link-to "https://en.wikipedia.org/wiki/Jody_Hill" "Jody Hill")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Turn:_Washington%27s_Spies" "Turn: Washington's Spies")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/One-drop_rule" "One-drop rule")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Jupiter_Ascending" "Jupiter Ascending")
                          ", or perhaps more accurately "
                          (link-to "http://www.rottentomatoes.com/m/jupiter_ascending_2014/" "descending")
                          [:br]
                          (link-to "http://searchsecurity.techtarget.com/definition/RAT-remote-access-Trojan" "Remote Access Trojan")]}
                 {:date "2016/05/04"
                  :address "9226 1st Ave NW, Seattle, WA 98117, USA",
                  :synopsis "May 4th, 2016: Hot Dogs, The 5th Wave, and The Choice."
                  :food ["Hebrew National Hot Dogs"
                         "Original Hawaiian Sweet Hot Dog Buns"
                         "Keebler Fudge Stripes Original"
                         "Keebler Chips Deluxe Chocolate Lovers Cookies"
                         "Doritos Mix Cheese Explosion Chips"]
                  :attendees ["Alex Sanchez"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"]
                  :media [{:title "The 5th Wave" :uri "http://www.imdb.com/title/tt2304933/"}
                          {:title "The Choice" :uri "http://www.imdb.com/title/tt3797868/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Adult" "Adulthood")
                          [:br]
                          (link-to "http://www.seattletimes.com/business/real-estate/home-prices-charge-ahead-driving-some-buyers-farther-afield/" "Seattle's")
                          " "
                          (link-to "http://www.seattletimes.com/business/real-estate/seattle-home-prices-outpace-us-rise-but-gains-slowing/" "Housing")
                          " "
                          (link-to "http://www.wsj.com/articles/in-silicon-seattle-high-home-prices-1461163535" "Market")
                          [:br]
                          (link-to "https://www.washingtonpost.com/national/health-science/adult-coloring-books-are-not-just-a-fad-for-some-they-are-a-lifesaver/2016/05/02/47449320-f8c2-11e5-a3ce-f06b5ba21f33_story.html" "Coloring Books")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Homelessness_in_Seattle" "Homelessness")
                          " "
                          (link-to "http://www.nytimes.com/2016/05/04/us/seattle-tech-boom-amazon-homelessness.html" "in")
                          " "
                          (link-to "http://time.com/4297797/amazon-homeless-shelter-seattle/" "Seattle")
                          [:br]
                          (link-to "http://www.kingshawaiian.com/products/hotdog-buns/" "\"These are the buns everyone has been asking for!\"")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Captain_America:_Civil_War" "Civil War")
                          " (no, not "
                          (link-to "https://en.wikipedia.org/wiki/American_Civil_War" "that one")
                          ", or the "
                          (link-to "https://en.wikipedia.org/wiki/Syrian_Civil_War" "other one")
                          " from recent memory)"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Young_adult_fiction" "Young Adult Fiction")
                          [:br]
                          (link-to "http://www.theguardian.com/us-news/2016/apr/22/us-suicide-rate-30-year-high-growing-epidemic-across-america" "Suicide")
                          [:br]
                          (link-to "https://youtu.be/Q8XSARX3DQg" "Green Room")
                          [:br]
                          (link-to "https://youtu.be/QWr3mLI8Xl8" "Pride and Prejudice and Zombies")
                          [:br]
                          (link-to "http://www.rollingstone.com/politics/news/ted-cruz-will-die-so-that-you-may-live-20160504" "Ted")
                          " "
                          (link-to "http://www.theguardian.com/media/2016/may/04/ted-cruz-campaign-social-media-memes-zodiac-killer" "Cruz")
                          ": "
                          (link-to "http://www.politico.com/story/2016/04/john-beohner-ted-cruz-lucifer-222570" "\"Lucifer in the flesh\"")]}
                 {:date "2016/04/20"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "April 20th, 2016: Fuller House, Litle Boy, and Misconduct."
                  :food ["Keelber Jif Peanut Butter Cookies"
                         "Keebler Fudge Stripes Original"
                         "Keelber Chips Deluxe Rainbow Chocolate Chip Cookies with M&M Chocolate Candies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Fuller House" :uri "http://www.imdb.com/title/tt3986586/"}
                          {:title "Little Boy" :uri "http://www.imdb.com/title/tt1810683/"}
                          {:title "Misconduct" :uri "http://www.imdb.com/title/tt3658772/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/Unbreakable_Kimmy_Schmidt" "Unbreakable Kimmy Schmidt")
                          " ("
                          (link-to "http://www.imdb.com/title/tt3339966/episodes?season=2" "Season Two")
                          " )"
                          [:br]
                          (link-to "http://www.imdb.com/name/nm0001650/" "Michael Rapaport")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Internment_of_Japanese_Americans" "Japanese Internment")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Little_Boy" "Little Boy"),
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Fat_Man" "Fat Man")
                          ", and the "
                          (link-to "https://en.wikipedia.org/wiki/Enola_Gay" "Enola Gay")
                          [:br]
                          (link-to "http://www.imdb.com/name/nm0241049/" "Josh Duhamel")
                          " and "
                          (link-to "http://www.imdb.com/title/tt2879552/" "11.22.63")]}
                 {:date "2016/04/13"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "April 13th, 2016: Chili Dogs, In the Heart of the Sea, and Victor Frankenstein."
                  :food ["Chili Dogs"
                         "Hydrox Creme Filled Chocolage Sandwich Cookies"
                         "Keebler Fudge Stripes Original"
                         "Chips Ahoy Rainbow Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "In the Heart of the Sea" :uri "http://www.imdb.com/title/tt1390411/"}
                          {:title "Victor Frankenstein" :uri "http://www.imdb.com/title/tt1976009/"}]
                  :notes [(link-to "http://www.nytimes.com/1989/09/05/us/l-new-york-was-gotham-before-batman-829789.html" "Gotham")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Gotham_City" "Gotham City")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Metropolis_(comics)" "Metropolis")
                          [:br]
                          (link-to "https://www.youtube.com/user/Uptomyknees" "Max Landis")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Whaling_in_the_United_States" "Whaling")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Scrimshaw" "Scrimshaw")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Tack_(sailing)" "Tacking")
                          [:br]
                          (link-to "http://q13fox.com/2016/04/12/grisly-details-revealed-in-murder-of-renton-mom-suspect-claimed-he-was-too-drunk-to-remember-prosecutors-say/" "Death and dismemberment")
                          ", "
                          (link-to "http://q13fox.com/2016/03/29/reward-up-to-13000-after-dog-named-justice-found-raped-and-killed-in-thurston-county/" "rape and murder")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Milo%C5%A1_Forman" "Miloš Forman's")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Amadeus_(film)" "Amadeus")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Flannery_O%27Connor" "Flannery O'Connor")
                          [:br]
                          (link-to "http://www.imdb.com/title/tt4824308/" "God's Not Dead 2")
                          " and "
                          (link-to "http://www.imdb.com/title/tt4257926" "Miracles from Heaven")]}
                 {:date "2016/04/06"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "April 6th, 2016: Fuller House, and Jobs."
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Kaia"]
                  :media [{:title "Fuller House" :uri "http://www.imdb.com/title/tt3986586/"}
                          {:title "Jobs" :uri "http://www.imdb.com/title/tt2357129/"}]}
                 {:date "2016/03/23"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA",
                  :synopsis "March 23rd, 2016: Cookies, Fuller House, Straw Dogs, and Persecuted."
                  :food ["Hydrox Creme Filled Chocolate Sandwich Cookies"
                         "Oreo Sandwich Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Fuller House" :uri "http://www.imdb.com/title/tt3986586/"}
                          {:title "Straw Dogs" :uri "http://www.imdb.com/title/tt0999913/"}
                          {:title "Persecuted" :uri "http://www.imdb.com/title/tt1761005/"}]
                  :notes [(link-to "http://www.imdb.com/name/nm0001603/" "Sam Peckinpah's")
                          " "
                          (link-to "http://www.imdb.com/title/tt0067800/" "Straw Dogs")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Battle_of_Stalingrad" "Battle of Stalingrad")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=-bzWSJG93P8&list=RD-bzWSJG93P8" "Imperial March")
                          ", "
                          (link-to "https://www.youtube.com/watch?v=8dw4APE9LmE&list=PL3ww1i4eVAAKrImVNYhdqymIaM2iuD-WB" "Dune")
                          ", "
                          (link-to "https://www.youtube.com/watch?v=L0bcRCCg01I" "Mars, the Bringer of War")
                          " ("
                          (link-to "http://tvtropes.org/pmwiki/pmwiki.php/SuspiciouslySimilarSong/Film" "suspiciously similar songs")
                          ")"
                          [:br]
                          (link-to "http://www.imdb.com/title/tt2975590/" "Batman v Superman")
                          ": "
                          (link-to "http://www.rottentomatoes.com/m/batman_v_superman_dawn_of_justice/" "Dawn of Justice")
                          " (w/ "
                          (link-to "https://www.youtube.com/watch?v=cwXfv25xJUw" "Ben Affleck")
                          ")"
                          [:br]
                          (link-to "http://www.imdb.com/title/tt1935859/" "Miss Peregrine's Home for Peculiar Children")]}
                 {:date "2016/03/16"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "March 16th, 2016: Cookies, Fuller House, Pinocchio, and Extraction."
                  :food ["Hydrox Creme Filled Chocolate Sandwich Cookies"
                         "Pepperidge Farm Double Chocolate Milano"
                         "Pepperidge Farm Dulce de Leche Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Fuller House" :uri "http://www.imdb.com/title/tt3986586/"}
                          {:title "Pinocchio" :uri "http://www.imdb.com/title/tt2826774/"}
                          {:title "Extraction" :uri "http://www.imdb.com/title/tt4382872/"}]
                  :notes [(link-to "https://en.wikipedia.org/wiki/H._P._Lovecraft" "Lovecraft")
                          "-"
                          (link-to "https://en.wikipedia.org/wiki/Harry_Houdini" "Houdini")
                          ": "
                          (link-to "http://www.theguardian.com/books/2016/mar/16/hp-lovecraft-harry-houdini-manuscript-cancer-superstition-memorabilia" "The Cancer of Superstition")
                          [:br]
                          (link-to "http://www.nytimes.com/2016/03/17/us/politics/obama-supreme-court-nominee.html" "Merrick Garland")
                          ", and "
                          (link-to "http://www.nytimes.com/2016/03/17/us/politics/candidates-stick-to-party-lines-in-debate-over-supreme-court-nomination.html?ribbon-ad-idx=4&rref=politics&module=Ribbon&version=context&region=Header&action=click&contentCollection=Politics&pgtype=article" "Republican obstructionism")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Dancing_with_the_Stars_(U.S._TV_series)" "Dancing with the Stars")
                          [:br]
                          "The "
                          (link-to "https://www.youtube.com/watch?v=IdvDbbTnkyI" "Nabisco Thing")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Paul_Scheer" "Paul Scheer")
                          " conspiracy theory"
                          [:br]
                          "Age of "
                          (link-to "https://en.wikipedia.org/wiki/Micro" "Micro")
                          ": "
                          (link-to "https://en.wikipedia.org/wiki/Micropenis" "penis")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Microcephaly" "cephaly")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Microtransaction" "transaction")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Microaggression_theory" "aggression")
                          [:br]
                          (link-to "http://hoverhands.org/" "Hover Hands")
                          [:br]
                          (link-to "http://www.surlalunefairytales.com/bookstore/europefilms.html" "Russo-Finnish Films")
                          " (e.g., "
                          (link-to "http://www.imdb.com/title/tt0058374/" "Jack")
                          " "
                          (link-to "http://mst3k.wikia.com/wiki/Jack_Frost" "Frost")
                          ")"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Romani_people" "Romani")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Jean_Vigo" "Jean Vigo's")
                          " "
                          (link-to "https://www.youtube.com/watch?v=YUkW1LBuQcg" "Zero for Conduct")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Robert_Bresson" "Robert Bresson's")
                          " "
                          (link-to "https://www.youtube.com/watch?v=JToByR14Q0Y" "Au hasard Balthazar")
                          [:br]
                          "The "
                          (link-to "http://www.feralaudio.com/show/x-files-files/" "X-Files Files")
                          ", and a "
                          (link-to "https://en.wikipedia.org/wiki/Space_(The_X-Files)" "painful episode")
                          " (as remembered by Greg)"
                          [:br]
                          (link-to "http://www.imdb.com/name/nm1553725/" "Kellan")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Kellan_Lutz" "Lutz")
                          [:br]
                          "How much did "
                          (link-to "https://en.wikipedia.org/wiki/Dan_Bilzerian" "Dan")
                          " "
                          (link-to "http://www.gq-magazine.co.uk/article/the-truth-about-dan-bilzerian" "Bilzerian")
                          " "
                          (link-to "http://www.hollywoodreporter.com/thr-esq/actor-sues-lone-survivor-producers-616876" "pay to be in this movie")
                          "?"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Prague" "Prague")
                          ": a place to "
                          (link-to "http://www.telegraph.co.uk/finance/jobs/11363335/The-13-best-places-in-the-world-to-work-remotely.html?frame=3174325" "work remotely")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Markup_language" "Markup languages")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Leet" "leetspeak")
                          [:br]
                          (link-to "http://www.apple.com/customer-letter/" "Apple")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/FBI%E2%80%93Apple_encryption_dispute" "encryption")
                          " "
                          (link-to "http://www.npr.org/sections/thetwo-way/2016/02/17/467096705/apple-the-fbi-and-iphone-encryption-a-look-at-whats-at-stake" "debate")
                          [:br]
                          (link-to "https://www.yikyak.com/home" "Yik Yak")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/World_War_II" "World War II")
                          ": "
                          (link-to "https://en.wikipedia.org/wiki/Total_war#World_War_II" "total war")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Atomic_bombings_of_Hiroshima_and_Nagasaki" "the atomic bomb")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/The_Holocaust" "industrial scale murder")
                          [:br]
                          (link-to "http://www.theatlantic.com/magazine/archive/2016/04/the-obama-doctrine/471525/" "The Obama Doctrine")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Syrian_Civil_War" "Syrian Civil War")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Saudi_Arabia" "Saudi Arabia")
                          ", the "
                          (link-to "https://en.wikipedia.org/wiki/House_of_Saud" "House of Saud")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Wahhabism" "Wahhabism")]}
                 {:date "2016/03/09"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "March 9th, 2016: Fettuccine Alfredo, Fuller House, San Andreas, and David and Goliath."
                  :food ["Fettuccine Alfredo"
                         "Tim's Cascade Coney Island Chips"
                         "Red Velvet Oreo Sandwich Cookies"
                         "Pepperidge Farm Double Chocolate Milano"
                         "Pepperidge Farm Dessert Shop S'mores Cookies"
                         "Pepperidge Farm Montauk Milk Chocolate Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Fuller House" :uri "http://www.imdb.com/title/tt3986586/"}
                          {:title "San Andreas" :uri "http://www.imdb.com/title/tt2126355/"}
                          {:title "David and Goliath" :uri "http://www.imdb.com/title/tt3962210/"}]
                  :notes [(link-to "http://www.seattletimes.com/seattle-news/greenwood-explosion-destroys-buildings-injures-9-firefighters/" "Explosion in Greenwood")
                          [:br]
                          (link-to "http://www.eonline.com/news/746872/jodie-sweetin-isn-t-paying-attention-to-miley-cyrus-instagram-photo" "Miley Cyrus vs Jodie Sweetin")
                          " ("
                          (link-to "https://s-media-cache-ak0.pinimg.com/736x/d9/ac/99/d9ac99d6eeb539dd119cfbecbb3c4d19.jpg" "Whoever wins...we lose")
                          ")"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Hydrox" "Hydrox")
                          " "
                          (link-to "http://www.npr.org/2015/09/23/442761531/one-mans-mission-to-bring-back-hydrox-cookies" "returns")
                          [:br]
                          (link-to "https://www.usa.gov/elected-officials" "Contacting your senator or congressman")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Go_(game)" "Go")
                          ", or: "
                          (link-to "https://deepmind.com/alpha-go.html" "Computer beats human at Ken Griffey Jr. Baseball")
                          [:br]
                          (link-to "http://kernelmag.dailydot.com/issue-list/the-future-of-work/" "Automation")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Basic_income" "Basic Income")
                          ", and "
                          (link-to "https://en.wikipedia.org/wiki/Rent-seeking" "rent-seeking")
                          " ("
                          (link-to "https://en.wikipedia.org/wiki/Capital_in_the_Twenty-First_Century" "Capital in the Twenty-First Century")
                          ")"
                          [:br]
                          (link-to "http://www.latimes.com/nation/nationnow/la-na-immigration-family-detention-20151020-story.html" "Immigrant family")
                          " "
                          (link-to "https://news.vice.com/article/how-us-immigrant-detention-facilities-get-away-with-being-complete-hellholes" "detention centers")
                          [:br]
                          (link-to "https://bfi.org/about-fuller/big-ideas/geodesic-domes" "Fuller's House")
                          [:br]
                          (link-to "http://www.pablopicasso.org/cubism.jsp" "Picasso's")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Cubism" "Cubism")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Eigenvalues_and_eigenvectors" "Eigenvalues")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Linear_algebra" "linear algebra")
                          [:br]
                          (link-to "http://tidal.com/" "Tidal")
                          [:br]
                          (link-to "http://www.theonion.com/" "The Onion")
                          " on "
                          (link-to "https://www.instagram.com/theonion/?hl=en" "Instagram")
                          ", "
                          (link-to "http://www.clickhole.com/" "ClickHole")
                          ", and "
                          (link-to "http://www.clickhole.com/quiz/how-deep-your-love-beautiful-super-mario-how-endle-1455" "How deep is your love for the beautiful Super Mario?")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Tsunami" "Tsunamis")
                          " and "
                          (link-to "https://www.youtube.com/watch?v=Wx9vPv-T51I" "how they work")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Richter_magnitude_scale" "Richter")
                          " vs. "
                          (link-to "https://en.wikipedia.org/wiki/Moment_magnitude_scale" "Moment magnitude")
                          " scale"
                          [:br]
                          (link-to "https://www.oculus.com/en-us/" "Oculus Rift")
                          " and the "
                          (link-to "https://www.google.com/get/cardboard/" "burgeoning")
                          " "
                          (link-to "http://www.theatlantic.com/magazine/archive/2015/10/virtual-reality-gets-real/403225/" "virtual reality")
                          [:br]
                          (link-to "http://www.nytimes.com/2016/03/10/style/second-wachowski-sibling-comes-out-as-transgender-woman.html" "Lilly Wachowski")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Fraternal_birth_order_and_male_sexual_orientation" "fraternal birth order and male sexual orientation")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Dinesh_D%27Souza" "Dinesh")
                          " "
                          (link-to "http://www.vanityfair.com/news/2015/04/dinesh-dsouza-video-life-after-conviction" "D'Souza")
                          " teases "
                          (link-to "https://www.youtube.com/watch?v=r7e6gLht6OQ" "Hillary's America")
                          [:br]
                          (link-to "http://obduction.com/" "Obduction")
                          " from the creators of "
                          (link-to "https://en.wikipedia.org/wiki/Myst" "Myst")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Diane_Arbus" "Diane Arbus")
                          ", "
                          (link-to "https://en.wikipedia.org/wiki/Vivian_Maier" "Vivian Maier")
                          " and "
                          (link-to "https://en.wikipedia.org/wiki/Motivation#Intrinsic_motivation" "intrinsic motivation")
                          ", "
                          (link-to "http://www.humansofnewyork.com/" "Humans of New York")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Knight_of_Cups_(film)" "Knight of Cups")
                          [:br]
                          (link-to "https://github.com/gorhill/uBlock" "uBlock Origin")
                          ": "
                          (link-to "https://github.com/fivefilters/block-ads/wiki/There-are-no-acceptable-ads#wrapper" "there are no acceptable ads")
                          " (tell "
                          (link-to "https://nakedsecurity.sophos.com/2016/02/10/wired-to-ad-blocker-users-pay-up-for-ad-free-site-or-you-get-nothing/" "Wired")
                          ")"
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=4rW1wuNyDKg" "The big Foo Fighters announcement")]}
                 {:date "2016/03/02"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "March 2nd, 2016: Chili Dogs, Fuller House, The Intern, and Before We Go."
                  :food ["Chili Dogs"
                         "King's Hawaiian Original Sweet Dinner Rolls"
                         "Red Velvet Oreo Sandwich Cookies"
                         "Oreo Mega Stuf Chocolate Sandwich Cookies"
                         "Chips Ahoy! Original Chocolate Chip Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Fuller House" :uri "http://www.imdb.com/title/tt3986586/"}
                          {:title "The Intern" :uri "http://www.imdb.com/title/tt2361509/"}
                          {:title "Before We Go" :uri "http://www.imdb.com/title/tt0443465/"}]
                  :notes [(link-to "http://www.imdb.com/title/tt4635276/" "Master of None")
                          ", "
                          (link-to "http://www.imdb.com/title/tt4061080/" "Love")
                          ", and "
                          (link-to "http://www.imdb.com/title/tt3398228/" "BoJack Horseman")
                          ": Hollywood writing what it knows"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Emerging_adulthood_and_early_adulthood" "Emerging")
                          " "
                          (link-to "http://www.apa.org/monitor/jun06/emerging.aspx" "Adulthood")
                          [:br]
                          (link-to "http://www.avclub.com/review/netflixs-fuller-house-porn-parody-without-porn-232696" "Fuller House is like a porn parody without the porn")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=fJWmbLS2_ec" "Kokomo")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Red_velvet_cake" "Red Velvet")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=FR3u0WSEcgE" "#eatlikeaking")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=UCJJ1iZuoQ4" "Dekkar")
                          " performs at "
                          (link-to "https://www.youtube.com/watch?v=ANNOQWby8R8" "The 4th Annual Live On Cinema Oscar Special")
                          [:br]
                          (link-to "http://www.imdb.com/name/nm1913734/" "The")
                          " "
                          (link-to "http://www.imdb.com/name/nm0544718/" "Mara")
                          " "
                          (link-to "https://en.wikipedia.org/wiki/Tim_Mara" "Family")
                          [:br]
                          (link-to "http://www.nytimes.com/2016/03/01/arts/sam-smith-the-only-openly-gay-oscar-winner-not-really.html?_r=0" "Sam Smith")
                          " the "
                          (link-to "https://www.youtube.com/watch?v=8jzDnsjYv9A" "Writing's on the Wall")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Neanderthal" "Neanderthals")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=eW5_ZUFaKEw" "Spit Takes")
                          [:br]
                          (link-to "http://gawker.com/centennials-are-the-new-millennials-are-the-new-menaces-1705468073" "Centennials")]}
                 {:date "2016/02/24"
                  :address "1808 SW Elmgrove St, Seattle, WA 98106, USA"
                  :synopsis "February 24th, 2016: Pizza plus Worms, Jem and the Holograms, and The Visit."
                  :food ["Pizza from Frelard Pizza Company"
                         "Trolli Sour Brite Crawlers Gummi Candy"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"]
                  :media [{:title "Jem and the Holograms" :uri "http://www.imdb.com/title/tt3614530/"}
                          {:title "The Visit" :uri "http://www.imdb.com/title/tt3567288/"}]
                  :notes [(link-to "https://www.instagram.com/p/BCMvCdjMX6V/" "Jammers")
                          [:br]
                          (link-to "http://jezebel.com/how-we-failed-to-protect-kesha-1760142637?rev=1455919264571" "The Pending Emancipation of Kesha")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Found_footage_(pseudo-documentary)" "Found Footage")
                          " and "
                          (link-to "http://www.mediapost.com/publications/article/164602/hasbro-plays-product-placement-game.html#ixzz1hBGO1uEO" "Hasbro Product Placement")
                          [:br]
                          "The assassination of the Republican party by the coward "
                          (link-to "http://www.rollingstone.com/politics/news/how-america-made-donald-trump-unstoppable-20160224?page=12" "Donald Trump")]}
                 {:date "2016/02/10"
                  :address "3828 Meridian Ave N, Seattle, WA 98103, USA"
                  :synopsis "February 10th, 2016: Sausages and Hot Dogs, Jackie & Ryan, and Insurgent."
                  :food ["Sausages"
                         "Smart Dogs Vegetarian Hot Dogs"
                         "Pringles Pizza"
                         "Chips Ahoy! Chewy Oreo Creme Filled"
                         "Chips Ahoy! Chewy Chocolate Chip Cookies"]
                  :attendees ["Alex Sanchez"
                              "Greg Ryan"
                              "Jason Aumann"
                              "Jacob Dobner"
                              "Colin Teal"
                              "Kaia"]
                  :media [{:title "Jackie & Ryan" :uri "http://www.imdb.com/title/tt3270108/"}
                          {:title "Insurgent" :uri "http://www.imdb.com/title/tt2908446/"}]
                  :notes [(link-to "http://www.nature.com/news/babylonian-astronomers-used-geometry-to-track-jupiter-1.19261" "Babylonian astronomers used geometry to track Jupiter")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Ancient_astronaut_hypothesis" "Ancient Astronauts")
                          [:br]
                          (link-to "http://www.newyorker.com/culture/cultural-comment/hello-again-the-weirdness-of-the-lcd-soundsystem-reunion" "LCD Soundsystem Reunion")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=nWPM1jTnuuo" "The Choice")
                          [:br]
                          (link-to "http://www.bbc.com/news/world-us-canada-35552820" "The Oregon Standoff")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/United_States_Postmaster_General" "The highest paid government official")
                          [:br]
                          (link-to "https://www.washingtonpost.com/news/federal-eye/wp/2015/08/24/millennials-working-in-government-are-at-their-lowest-levels-in-five-yearsnew-report-finds/" "Erosion of the government workforce")
                          " (which might have to do in part with "
                          (link-to "http://www.fbiagentedu.org/careers/fbi-special-agent/" "low pay")
                          ")"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Chivalric_order" "Chivalric orders")
                          " and "
                          (link-to "https://en.wikipedia.org/wiki/The_Man_Who_Would_Be_King" "The Man Who Would Be King")
                          [:br]
                          (link-to "http://www.nytimes.com/2014/03/16/science/billionaires-with-big-ideas-are-privatizing-american-science.html" "Private equity supplants government")
                          " while "
                          (link-to "https://newrepublic.com/article/121752/trade-deals-give-corporations-power-intimidate-tiny-countries" "corporations morph into states")
                          " ("
                          (link-to "http://www.bloomberg.com/news/articles/2015-12-18/amazon-said-to-mull-leasing-planes-to-control-delivery-chain" "Amazon the new behemoth")
                          ")"
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Jeff_Bezos" "Jeff Bezos")
                          " builds a "
                          (link-to "http://www.10000yearclock.net" "10,000 Year Clock")]}
                 {:date "2016/02/03"
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
                  :notes [(link-to "https://www.youtube.com/watch?v=wNNL9FIkF2E" "What if We Don't Want to Be Warm?")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=pXRviuL6vMY&feature=youtu.be" "Blurryface")
                          " and "
                          (link-to "https://www.youtube.com/watch?v=Y_rl4ZGdy34&feature=youtu.be" "White Privilege, II")
                          [:br]
                          (link-to "https://www.youtube.com/watch?v=XFxjy7f9RpY&feature=youtu.be" "Arden")
                          " "
                          (link-to "https://www.youtube.com/watch?v=1E9vj4WmHLM&feature=youtu.be" "Hayes")
                          ": "
                          (link-to "https://www.youtube.com/watch?v=jcOHdfbZ4Ok&feature=youtu.be" "genius")
                          [:br]
                          (link-to "http://www.affirmfilms.com/" "You are still watching...Blu-Ray")
                          " ("
                          (link-to "http://www.affirmfilms.com/resources/" "discussion guides")
                          ")"
                          [:br]
                          (link-to "http://www.metafilter.com/156532/freekesha" "#freekesha")
                          [:br]
                          (link-to "http://variety.com/2016/tv/news/joseph-fiennes-michael-jackson-casting-diversity-hollywood-whitewashing-1201690020/" "Joseph Fiennes as the King of Pop")
                          [:br]
                          (link-to "http://www.wired.com/2012/03/the-damning-backstory-behind-homeless-hotspots-at-sxswi/" "\"Acquiring Hobo...\"")
                          [:br]
                          (link-to "http://www.theverge.com/2016/1/28/10864034/windows-phone-is-dead" "Windows phone is dead")
                          [:br]
                          (link-to "http://www.rickyancey.com/books/the-5th-wave" "The 5th Wave, by Rick Yancey")
                          [:br]
                          (link-to "http://divergent.wikia.com/wiki/Abnegation" "The")
                          " "
                          (link-to "http://divergent.wikia.com/wiki/Candor" "Five")
                          " "
                          (link-to "http://divergent.wikia.com/wiki/Erudite" "Factions")
                          " "
                          (link-to "http://divergent.wikia.com/wiki/Dauntless" "of")
                          " "
                          (link-to "http://divergent.wikia.com/wiki/Amity" "Divergent")
                          [:br]
                          (link-to "https://en.wikipedia.org/wiki/Amusing_Ourselves_to_Death" "Amusing Ourselves to Death")
                          [:br]
                          (link-to "http://www.jamonexperience.com/en/" "A different kind of Beast Feast")
                          " (for Alex)"
                          [:br]
                          (link-to "http://www.beanogas.com/" "Possible remedy for Jason/Kaia")
                          [:br]
                          (link-to "https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#safe=off&q=super+bowl+commercials+2016" "87M results for \"Super Bowl Commercials 2016\"")
                          " ("
                          (link-to "http://www.cbsnews.com/media/9-super-bowl-commercials-already-getting-buzz/" "some tips for Greg when he finds himself around the proverbial watercooler")
                          ")"]}])
