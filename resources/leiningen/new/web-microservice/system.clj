(ns {{namespace}}
  (:require [com.stuartsierra.component :as component]
            [{{name}}.web.core :as web]))

(defn create
  [config]
  (let [{:keys [port]} config]
    (component/system-map
     :web (web/create port))))

(defn start
  [config]
  (component/start create))
