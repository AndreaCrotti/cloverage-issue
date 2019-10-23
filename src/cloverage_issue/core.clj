(ns cloverage-issue.core
  (:require [clojure.java.jdbc :as jdbc]
            [honeysql.format :as fmt])
  (:import [org.postgresql.util PGobject]))

;; Data types

(defn- ->pg-object [^String type ^String value]
  (doto (PGobject.)
    (.setType type)
    (.setValue value)))

;; Defines a wrapper record for a Postgres data type.
;; Create with `->name`, e.g. `(->jsonb {:foo 1})`.
(defmacro defpg [name args & sql-value-body]
  `(defrecord ~name ~args
     ;; tell clojure.java.jdbc how to convert this to something it knows how to write
     jdbc/ISQLValue
     (sql-value [~'this]
       ~@sql-value-body)

     ;; tell HoneySQL to pass this as-is
     fmt/ToSql
     (to-sql [~'this]
       (fmt/add-anon-param ~'this))))

(defpg enum [type value]
  (->pg-object type value))

(defn foo
  "I don't do a whole lot."
  [x]
  42)
