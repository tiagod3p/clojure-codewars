;; Given an array of integers,
;; find the one that appears an odd number of times.

;; There will always be only one integer
;; that appears an odd number of times.

;; Examples:

;; (find-odd [20 1 -1 2 -2 3 3 5 5 1 2 4 20 4 -1 -2 5]) =>  5
;; (find-odd [1 1 2 -2 5 2 4 4 -1 -2 5]) => -1
;; (find-odd [20 1 1 2 2 3 3 5 5 4 20 4 5]) => 5

(ns find-the-odd-int)

(defn find-odd [xs]
  (first (for [[k v] (frequencies xs) :when (odd? v)] k)))

(find-odd [20 1 -1 2 -2 3 3 5 5 1 2 4 20 4 -1 -2 5]);; => 5
(find-odd [1 1 2 -2 5 2 4 4 -1 -2 5]);; => -1
(find-odd [20 1 1 2 2 3 3 5 5 4 20 4 5]);; => 5
