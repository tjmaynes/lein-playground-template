(ns {{namespace}}
    (:require [aero.core :refer (read-config)]))

(defn- read-edn-file [profile]
  (read-config (clojure.java.io/resource "config.edn") {:profile profile}))

(defn get-config [args]
  (->> args
       first
       keyword
       read-edn-file))
