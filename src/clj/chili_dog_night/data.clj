(ns chili-dog-night.data
  (:require [hiccup.element :as el]))

(def gatherings [{:date "2016/03/23"
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
		  :notes [:p
                          (el/link-to "http://www.imdb.com/name/nm0001603/" "Sam Peckinpah's")
                          " "
                          (el/link-to "http://www.imdb.com/title/tt0067800/" "Straw Dogs")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Battle_of_Stalingrad" "Battle of Stalingrad")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=-bzWSJG93P8&list=RD-bzWSJG93P8" "Imperial March")
                          ", "
                          (el/link-to "https://www.youtube.com/watch?v=8dw4APE9LmE&list=PL3ww1i4eVAAKrImVNYhdqymIaM2iuD-WB" "Dune")
                          ", "
                          (el/link-to "https://www.youtube.com/watch?v=L0bcRCCg01I" "Mars, the Bringer of War")
                          " ("
                          (el/link-to "http://tvtropes.org/pmwiki/pmwiki.php/SuspiciouslySimilarSong/Film" "suspiciously similar songs")
                          ")"
                          [:br]
                          (el/link-to "http://www.imdb.com/title/tt2975590/" "Batman v Superman")
                          ": "
                          (el/link-to "http://www.rottentomatoes.com/m/batman_v_superman_dawn_of_justice/" "Dawn of Justice")
                          " (w/ "
                          (el/link-to "https://www.youtube.com/watch?v=cwXfv25xJUw" "Ben Affleck")
                          ")"
                          [:br]
                          (el/link-to "http://www.imdb.com/title/tt1935859/" "Miss Peregrine's Home for Peculiar Children")]}
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
                  :notes [:p
                          (el/link-to "https://en.wikipedia.org/wiki/H._P._Lovecraft" "Lovecraft")
                          "-"
                          (el/link-to "https://en.wikipedia.org/wiki/Harry_Houdini" "Houdini")
                          ": "
                          (el/link-to "http://www.theguardian.com/books/2016/mar/16/hp-lovecraft-harry-houdini-manuscript-cancer-superstition-memorabilia" "The Cancer of Superstition")
                          [:br]
                          (el/link-to "http://www.nytimes.com/2016/03/17/us/politics/obama-supreme-court-nominee.html" "Merrick Garland")
                          ", and "
                          (el/link-to "http://www.nytimes.com/2016/03/17/us/politics/candidates-stick-to-party-lines-in-debate-over-supreme-court-nomination.html?ribbon-ad-idx=4&rref=politics&module=Ribbon&version=context&region=Header&action=click&contentCollection=Politics&pgtype=article" "Republican obstructionism")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Dancing_with_the_Stars_(U.S._TV_series)" "Dancing with the Stars")
                          [:br]
                          "The "
                          (el/link-to "https://www.youtube.com/watch?v=IdvDbbTnkyI" "Nabisco Thing")
                          " "
                          (el/link-to "https://en.wikipedia.org/wiki/Paul_Scheer" "Paul Scheer")
                          " conspiracy theory"
                          [:br]
                          "Age of "
                          (el/link-to "https://en.wikipedia.org/wiki/Micro" "Micro")
                          ": "
                          (el/link-to "https://en.wikipedia.org/wiki/Micropenis" "penis")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Microcephaly" "cephaly")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Microtransaction" "transaction")
                          ", and "
                          (el/link-to "https://en.wikipedia.org/wiki/Microaggression_theory" "aggression")
                          [:br]
                          (el/link-to "http://hoverhands.org/" "Hover Hands")
                          [:br]
                          (el/link-to "http://www.surlalunefairytales.com/bookstore/europefilms.html" "Russo-Finnish Films")
                          " (e.g., "
                          (el/link-to "http://www.imdb.com/title/tt0058374/" "Jack")
                          " "
                          (el/link-to "http://mst3k.wikia.com/wiki/Jack_Frost" "Frost")
                          ")"
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Romani_people" "Romani")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Jean_Vigo" "Jean Vigo's")
                          " "
                          (el/link-to "https://www.youtube.com/watch?v=YUkW1LBuQcg" "Zero for Conduct")
                          ", and "
                          (el/link-to "https://en.wikipedia.org/wiki/Robert_Bresson" "Robert Bresson's")
                          " "
                          (el/link-to "https://www.youtube.com/watch?v=JToByR14Q0Y" "Au hasard Balthazar")
                          [:br]
                          "The "
                          (el/link-to "http://www.feralaudio.com/show/x-files-files/" "X-Files Files")
                          ", and a "
                          (el/link-to "https://en.wikipedia.org/wiki/Space_(The_X-Files)" "painful episode")
                          " (as remembered by Greg)"
                          [:br]
                          (el/link-to "http://www.imdb.com/name/nm1553725/" "Kellan")
                          " "
                          (el/link-to "https://en.wikipedia.org/wiki/Kellan_Lutz" "Lutz")
                          [:br]
                          "How much did "
                          (el/link-to "https://en.wikipedia.org/wiki/Dan_Bilzerian" "Dan")
                          " "
                          (el/link-to "http://www.gq-magazine.co.uk/article/the-truth-about-dan-bilzerian" "Bilzerian")
                          " "
                          (el/link-to "http://www.hollywoodreporter.com/thr-esq/actor-sues-lone-survivor-producers-616876" "pay to be in this movie")
                          "?"
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Prague" "Prague")
                          ": a place to "
                          (el/link-to "http://www.telegraph.co.uk/finance/jobs/11363335/The-13-best-places-in-the-world-to-work-remotely.html?frame=3174325" "work remotely")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Markup_language" "Markup languages")
                          ", and "
                          (el/link-to "https://en.wikipedia.org/wiki/Leet" "leetspeak")
                          [:br]
                          (el/link-to "http://www.apple.com/customer-letter/" "Apple")
                          " "
                          (el/link-to "https://en.wikipedia.org/wiki/FBI%E2%80%93Apple_encryption_dispute" "encryption")
                          " "
                          (el/link-to "http://www.npr.org/sections/thetwo-way/2016/02/17/467096705/apple-the-fbi-and-iphone-encryption-a-look-at-whats-at-stake" "debate")
                          [:br]
                          (el/link-to "https://www.yikyak.com/home" "Yik Yak")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/World_War_II" "World War II")
                          ": "
                          (el/link-to "https://en.wikipedia.org/wiki/Total_war#World_War_II" "total war")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Atomic_bombings_of_Hiroshima_and_Nagasaki" "the atomic bomb")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/The_Holocaust" "industrial scale murder")
                          [:br]
                          (el/link-to "http://www.theatlantic.com/magazine/archive/2016/04/the-obama-doctrine/471525/" "The Obama Doctrine")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Syrian_Civil_War" "Syrian Civil War")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Saudi_Arabia" "Saudi Arabia")
                          ", the "
                          (el/link-to "https://en.wikipedia.org/wiki/House_of_Saud" "House of Saud")
                          ", and "
                          (el/link-to "https://en.wikipedia.org/wiki/Wahhabism" "Wahhabism")]}
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
                  :notes [:p
                          (el/link-to "http://www.seattletimes.com/seattle-news/greenwood-explosion-destroys-buildings-injures-9-firefighters/" "Explosion in Greenwood")
                          [:br]
                          (el/link-to "http://www.eonline.com/news/746872/jodie-sweetin-isn-t-paying-attention-to-miley-cyrus-instagram-photo" "Miley Cyrus vs Jodie Sweetin")
                          " ("
                          (el/link-to "https://s-media-cache-ak0.pinimg.com/736x/d9/ac/99/d9ac99d6eeb539dd119cfbecbb3c4d19.jpg" "Whoever wins...we lose")
                          ")"
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Hydrox" "Hydrox")
                          " "
                          (el/link-to "http://www.npr.org/2015/09/23/442761531/one-mans-mission-to-bring-back-hydrox-cookies" "returns")
                          [:br]
                          (el/link-to "https://www.usa.gov/elected-officials" "Contacting your senator or congressman")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Go_(game)" "Go")
                          ", or: "
                          (el/link-to "https://deepmind.com/alpha-go.html" "Computer beats human at Ken Griffey Jr. Baseball")
                          [:br]
                          (el/link-to "http://kernelmag.dailydot.com/issue-list/the-future-of-work/" "Automation")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Basic_income" "Basic Income")
                          ", and "
                          (el/link-to "https://en.wikipedia.org/wiki/Rent-seeking" "rent-seeking")
                          " ("
                          (el/link-to "https://en.wikipedia.org/wiki/Capital_in_the_Twenty-First_Century" "Capital in the Twenty-First Century")
                          ")"
                          [:br]
                          (el/link-to "http://www.latimes.com/nation/nationnow/la-na-immigration-family-detention-20151020-story.html" "Immigrant family")
                          " "
                          (el/link-to "https://news.vice.com/article/how-us-immigrant-detention-facilities-get-away-with-being-complete-hellholes" "detention centers")
                          [:br]
                          (el/link-to "https://bfi.org/about-fuller/big-ideas/geodesic-domes" "Fuller's House")
                          [:br]
                          (el/link-to "http://www.pablopicasso.org/cubism.jsp" "Picasso's")
                          " "
                          (el/link-to "https://en.wikipedia.org/wiki/Cubism" "Cubism")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Eigenvalues_and_eigenvectors" "Eigenvalues")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Linear_algebra" "linear algebra")
                          [:br]
                          (el/link-to "http://tidal.com/" "Tidal")
                          [:br]
                          (el/link-to "http://www.theonion.com/" "The Onion")
                          " on "
                          (el/link-to "https://www.instagram.com/theonion/?hl=en" "Instagram")
                          ", "
                          (el/link-to "http://www.clickhole.com/" "ClickHole")
                          ", and "
                          (el/link-to "http://www.clickhole.com/quiz/how-deep-your-love-beautiful-super-mario-how-endle-1455" "How deep is your love for the beautiful Super Mario?")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Tsunami" "Tsunamis")
                          " and "
                          (el/link-to "https://www.youtube.com/watch?v=Wx9vPv-T51I" "how they work")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Richter_magnitude_scale" "Richter")
                          " vs. "
                          (el/link-to "https://en.wikipedia.org/wiki/Moment_magnitude_scale" "Moment magnitude")
                          " scale"
                          [:br]
                          (el/link-to "https://www.oculus.com/en-us/" "Oculus Rift")
                          " and the "
                          (el/link-to "https://www.google.com/get/cardboard/" "burgeoning")
                          " "
                          (el/link-to "http://www.theatlantic.com/magazine/archive/2015/10/virtual-reality-gets-real/403225/" "virtual reality")
                          [:br]
                          (el/link-to "http://www.nytimes.com/2016/03/10/style/second-wachowski-sibling-comes-out-as-transgender-woman.html" "Lilly Wachowski")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Fraternal_birth_order_and_male_sexual_orientation" "fraternal birth order and male sexual orientation")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Dinesh_D%27Souza" "Dinesh")
                          " "
                          (el/link-to "http://www.vanityfair.com/news/2015/04/dinesh-dsouza-video-life-after-conviction" "D'Souza")
                          " teases "
                          (el/link-to "https://www.youtube.com/watch?v=r7e6gLht6OQ" "Hillary's America")
                          [:br]
                          (el/link-to "http://obduction.com/" "Obduction")
                          " from the creators of "
                          (el/link-to "https://en.wikipedia.org/wiki/Myst" "Myst")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Diane_Arbus" "Diane Arbus")
                          ", "
                          (el/link-to "https://en.wikipedia.org/wiki/Vivian_Maier" "Vivian Maier")
                          " and "
                          (el/link-to "https://en.wikipedia.org/wiki/Motivation#Intrinsic_motivation" "intrinsic motivation")
                          ", "
                          (el/link-to "http://www.humansofnewyork.com/" "Humans of New York")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Knight_of_Cups_(film)" "Knight of Cups")
                          [:br]
                          (el/link-to "https://github.com/gorhill/uBlock" "uBlock Origin")
                          ": "
                          (el/link-to "https://github.com/fivefilters/block-ads/wiki/There-are-no-acceptable-ads#wrapper" "there are no acceptable ads")
                          " (tell "
                          (el/link-to "https://nakedsecurity.sophos.com/2016/02/10/wired-to-ad-blocker-users-pay-up-for-ad-free-site-or-you-get-nothing/" "Wired")
                          ")"
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=4rW1wuNyDKg" "The big Foo Fighters announcement")]}
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
                  :notes [:p
                          (el/link-to "http://www.imdb.com/title/tt4635276/" "Master of None")
                          ", "
                          (el/link-to "http://www.imdb.com/title/tt4061080/" "Love")
                          ", and "
                          (el/link-to "http://www.imdb.com/title/tt3398228/" "BoJack Horseman")
                          ": Hollywood writing what it knows"
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Emerging_adulthood_and_early_adulthood" "Emerging")
                          " "
                          (el/link-to "http://www.apa.org/monitor/jun06/emerging.aspx" "Adulthood")
                          [:br]
                          (el/link-to "http://www.avclub.com/review/netflixs-fuller-house-porn-parody-without-porn-232696" "Fuller House is like a porn parody without the porn")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=fJWmbLS2_ec" "Kokomo")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Red_velvet_cake" "Red Velvet")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=FR3u0WSEcgE" "#eatlikeaking")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=UCJJ1iZuoQ4" "Dekkar")
                          " performs at "
                          (el/link-to "https://www.youtube.com/watch?v=ANNOQWby8R8" "The 4th Annual Live On Cinema Oscar Special")
                          [:br]
                          (el/link-to "http://www.imdb.com/name/nm1913734/" "The")
                          " "
                          (el/link-to "http://www.imdb.com/name/nm0544718/" "Mara")
                          " "
                          (el/link-to "https://en.wikipedia.org/wiki/Tim_Mara" "Family")
                          [:br]
                          (el/link-to "http://www.nytimes.com/2016/03/01/arts/sam-smith-the-only-openly-gay-oscar-winner-not-really.html?_r=0" "Sam Smith")
                          " the "
                          (el/link-to "https://www.youtube.com/watch?v=8jzDnsjYv9A" "Writing's on the Wall")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Neanderthal" "Neanderthals")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=eW5_ZUFaKEw" "Spit Takes")
                          [:br]
                          (el/link-to "http://gawker.com/centennials-are-the-new-millennials-are-the-new-menaces-1705468073" "Centennials")]}
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
                  :notes [:p
                          (el/link-to "https://www.instagram.com/p/BCMvCdjMX6V/" "Jammers")
                          [:br]
                          (el/link-to "http://jezebel.com/how-we-failed-to-protect-kesha-1760142637?rev=1455919264571" "The Pending Emancipation of Kesha")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Found_footage_(pseudo-documentary)" "Found Footage")
                          " and "
                          (el/link-to "http://www.mediapost.com/publications/article/164602/hasbro-plays-product-placement-game.html#ixzz1hBGO1uEO" "Hasbro Product Placement")
                          [:br]
                          "The assassination of the Republican party by the coward "
                          (el/link-to "http://www.rollingstone.com/politics/news/how-america-made-donald-trump-unstoppable-20160224?page=12" "Donald Trump")]}
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
                  :notes [:p
                          (el/link-to "http://www.nature.com/news/babylonian-astronomers-used-geometry-to-track-jupiter-1.19261" "Babylonian astronomers used geometry to track Jupiter")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Ancient_astronaut_hypothesis" "Ancient Astronauts")
                          [:br]
                          (el/link-to "http://www.newyorker.com/culture/cultural-comment/hello-again-the-weirdness-of-the-lcd-soundsystem-reunion" "LCD Soundsystem Reunion")
                          [:br]
                          (el/link-to "https://www.youtube.com/watch?v=nWPM1jTnuuo" "The Choice")
                          [:br]
                          (el/link-to "http://www.bbc.com/news/world-us-canada-35552820" "The Oregon Standoff")
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/United_States_Postmaster_General" "The highest paid government official")
                          [:br]
                          (el/link-to "https://www.washingtonpost.com/news/federal-eye/wp/2015/08/24/millennials-working-in-government-are-at-their-lowest-levels-in-five-yearsnew-report-finds/" "Erosion of the government workforce")
                          " (which might have to do in part with "
                          (el/link-to "http://www.fbiagentedu.org/careers/fbi-special-agent/" "low pay")
                          ")"
                          [:br]
                          (el/link-to "https://en.wikipedia.org/wiki/Chivalric_order" "Chivalric orders")
                          " and "
                          (el/link-to "https://en.wikipedia.org/wiki/The_Man_Who_Would_Be_King" "The Man Who Would Be King")
                          [:br]
                          (el/link-to "http://www.nytimes.com/2014/03/16/science/billionaires-with-big-ideas-are-privatizing-american-science.html" "Private equity supplants government")
                          " while "
                          (el/link-to "https://newrepublic.com/article/121752/trade-deals-give-corporations-power-intimidate-tiny-countries" "corporations morph into states")
                          " ("
                          (el/link-to "http://www.bloomberg.com/news/articles/2015-12-18/amazon-said-to-mull-leasing-planes-to-control-delivery-chain" "Amazon the new behemoth")
                          ")"
                          [:br]
                          (el/link-to "http://www.bloomberg.com/news/articles/2015-12-18/amazon-said-to-mull-leasing-planes-to-control-delivery-chain")
                          (el/link-to "https://en.wikipedia.org/wiki/Jeff_Bezos" "Jeff Bezos")
                          " builds a "
                          (el/link-to "http://www.10000yearclock.net" "10,000 Year Clock")]}
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
