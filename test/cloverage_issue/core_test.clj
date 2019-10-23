(ns cloverage-issue.core-test
  (:require [clojure.test :refer :all]
            [cloverage-issue.core :as sut]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 42 (sut/foo nil)))))
