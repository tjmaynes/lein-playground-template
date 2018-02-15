(ns leiningen.new.web-microservice
  (:require [leiningen.new.templates :refer [renderer
                                             sanitize-ns
                                             multi-segment
                                             name-to-path
                                             ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "web-microservice"))

(defn web-microservice
  "A project template for building microservices in."
  [name]
  (let [main-ns (multi-segment (sanitize-ns name))
        data {:name name
              :namespace main-ns
              :nested-dirs (name-to-path main-ns)
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' microservice project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src/{{sanitized}}/system.clj" (render "system.clj" data)]
             ["src/{{sanitized}}/utils/config.clj" (render "utils__config.clj" data)]
             ["src/{{sanitized}}/api/core.clj" (render "web__core.clj" data)]
             ["src/{{sanitized}}/api/routes.clj" (render "web__routes.clj" data)]
             ["test/{{sanitized}}/api/core.clj" (render "test__core.clj" data)]
             ["Dockerfile" (render "Dockerfile" data)]
             ["resources/config.edn" (render "config.edn" data)]
             [".gitignore" (render "gitignore" data)]
             ["README.md" (render "README.md" data)])))
