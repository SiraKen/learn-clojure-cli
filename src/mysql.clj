(ns mysql
  (:require [clojure.java.jdbc :as j]))

(def mysql-db {:host "localhost"
               :port 3306
               :dbtype "mysql"
               :dbname "clojure-test"
               :user "root"
               :password "root"})

;; (j/insert-multi! mysql-db :users
;;                  [{:name "Clojure Test" :email "clojure@example.com"}])

(println (j/query mysql-db
                  ["SELECT * FROM users WHERE id = ?" 1]))