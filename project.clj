(defproject org.clojars.yonatane/sayid "0.0.10-SNAPSHOT"
  :description "Sayid is a library for debugging and profiling clojure code."
  :signing {:gpg-key "<bill@billpiel.com>"}
  :url "http://bpiel.github.io/sayid/"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [tamarin "0.1.1"]
                 [org.clojure/tools.reader "1.0.0-alpha3"]
                 [org.clojure/tools.namespace "0.2.11"]]
  :repl-options {:nrepl-middleware [com.billpiel.sayid.nrepl-middleware/wrap-sayid]}
  :profiles {:dev {:dependencies [[midje "1.8.3"]
                                  [org.clojure/tools.nrepl "0.2.10"]]
                   :plugins [[lein-midje "3.1.3"]
                             [lein-codox "0.9.4"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}}
  :codox {:project {:name "Sayid"}
          :namespaces [com.billpiel.sayid.core]}
  :aliases {"test-all" ["with-profile" "+1.4:+1.5:+1.6:+1.7:+1.8" "midje"]})
