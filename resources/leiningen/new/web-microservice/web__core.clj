(ns {{namespace}}
  (:require [com.stuartsierra.component :as component]
            [{{name}}.web.routes :as routes]
            [ring.adapter.jetty :as jetty]))

(defrecord Web [config web-service]
  component/Lifecycle
  (start [this]
    (if web-service
      this
      (assoc this :web-service
             (jetty/run-jetty routes/web-routes config))))
  (stop [this]
    (when web-service
      (.stop web-service))
    (assoc this :web-service nil)))

(defn create
  [config]
  (map->Web config))
