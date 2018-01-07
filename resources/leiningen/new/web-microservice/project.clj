(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "build microservices using clojure!"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}

  :min-lein-version "2.0.0"
 
  :main ^:skip-aot {{namespace}} 
  :source-paths ["src"]
  :target-path "target/%s"
  
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.1.143"]
                 [com.stuartsierra/component "0.3.2"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [compojure "1.6.0"]
                 [cheshire "5.8.0"]
                 [clj-http "3.7.0"]
                 [aero "1.1.2"]]

  :plugins [[lein-ring "0.12.3"]]
  
  :ring {:handler {{namespace}}/handler}
 
  :profiles {:uberjar {:aot :all}
             :dev {:repl-options
                   {:init-ns {{namespace}}}}}))
