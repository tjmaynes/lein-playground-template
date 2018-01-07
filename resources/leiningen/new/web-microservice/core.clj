(ns {{namespace}}
  (:require [com.stuartsierra.component :as component]
            [{{name}}.utils.config :as config]
            [{{name}}.system :as system]))

(defn -main [args &]
  (let [results (config/get-config args)]
    (component/start (system/start results))))
