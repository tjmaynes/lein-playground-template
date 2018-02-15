# lein-template

My [Leiningen](https://leiningen.org) templates for Clojure and ClojureScript projects.

## Usage

### Playground

To create a new playground project, run:

```bash
lein new playground new-playground-project
```

Included libraries:

- [clj-http](https://github.com/dakrone/clj-http) => HTTP Client library.
- [cheshire](https://github.com/dakrone/cheshire) => JSON Encoding/Decoding library.
- [aero](https://github.com/juxt/aero) => Read EDN files.

### Web-Microservice

To create a new web-based microservice project using this template, run:

```bash
lein new web-microservice new-web-microservice-project
```

Included libraries:

- [component](https://github.com/stuartsierra/component) => Dependency Injection library.
- [clojure.spec](https://clojure.org/about/spec) => Library for validating the structure of data...and much more.
- [ring](https://github.com/ring-clojure/ring) => HTTP Server library.
- [clj-http](https://github.com/dakrone/clj-http) => HTTP Client library.
- [cheshire](https://github.com/dakrone/cheshire) => JSON Encoding/Decoding library.
- [aero](https://github.com/juxt/aero) => Read EDN files.
- 