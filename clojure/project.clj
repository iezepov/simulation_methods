(defproject monte-carlo-clojure "0.0.0"
  :description "A project for doing Monte Carlo exercises."
  :license "Eclipse Public License 1.0"
  :url "http://github.com/technomancy/myproject"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.bhauman/rebel-readline "0.1.4"] 
                 [incanter "1.9.3"]]
  :plugins [[lein-tar "3.2.0"]]
  :aliases {"rebl" ["trampoline" "run" "-m" "rebel-readline.main"]})
   
