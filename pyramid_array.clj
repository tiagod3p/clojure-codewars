;; Write a function that when given a number >= 0,
;; returns an Array of ascending length subarrays.

;; pyramid(0) => [ ]
;; pyramid(1) => [ [1] ]
;; pyramid(2) => [ [1], [1, 1] ]
;; pyramid(3) => [ [1], [1, 1], [1, 1, 1] ]

;; Note: the subarrays should be filled with 1s

(ns pyramid-array)

(defn pyramid [n]
  (loop [repeats n
         coll    []]
    (if (zero? repeats)
      coll
      (recur (dec repeats) (cons (repeat repeats 1) coll)))))

(pyramid 0)
;; => []

(pyramid 1)
;; => ((1))

(pyramid 2)
;; => ((1) (1 1))

(pyramid 3)
;; => ((1) (1 1) (1 1 1))

