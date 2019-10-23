(defproject cloverage-issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cloverage "1.1.2"]
                 [honeysql "0.9.6"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [org.postgresql/postgresql "42.2.5"]]
  :plugins [[lein-cloverage "1.1.2"]]
  :repl-options {:init-ns cloverage-issue.core})
