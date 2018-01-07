(ns {{namespace}}
  (:require [com.stuartsierra.component :as component]
            [compojure.core :refer [routes]]))

(defn web-routes
  [web-service]
  (routes
   (GET "/status" [] "good!")))
