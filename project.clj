(defproject org.clojars.razum2um/marginalia "0.8.1-SNAPSHOT"
  :url "http://github.com/razum2um/marginalia"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :description "lightweight literate programming for clojure -- inspired by [docco](http://jashkenas.github.com/docco/)"
;;  :main marginalia.main
  :dependencies
  [[org.clojure/clojure "1.5.1"]
   [org.clojure/clojurescript "0.0-2138"]
   [org.clojure/tools.namespace "0.1.1"]
   [org.clojure/tools.cli "0.2.1"]
   [org.markdownj/markdownj "0.3.0-1.0.2b4"]
   [de.ubercode.clostache/clostache "1.3.1"]]

  :resource-paths ["vendor"]

  ;;Needed for testing Latex equation formatting. You must download
  ;;and install MathJax in you doc directory.
  :marginalia {:javascript ["mathjax/MathJax.js"]
               :ordering ["./src/marginalia/core.clj" "./src/marginalia/html.clj" "./src/marginalia/parser.clj" "./src/marginalia/main.clj" ]})
