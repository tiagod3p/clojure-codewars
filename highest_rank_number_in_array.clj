;; Complete the method which returns the number
;; which is most frequent in the given input array.
;; If there is a tie for most frequent number, return the largest number among them.

;; Note: no empty arrays will be given.
;; Examples

;; [12, 10, 8, 12, 7, 6, 4, 10, 12]              -->  12
;; [12, 10, 8, 12, 7, 6, 4, 10, 12, 10]          -->  12
;; [12, 10, 8, 8, 3, 3, 3, 3, 2, 4, 10, 12, 10]  -->   3

(ns highest-rank-number-in-array)

(defn highest-rank [data]
  (key (apply max-key val (into
                            (sorted-map)
                            (frequencies data)))))

(highest-rank [12 10 8 12 7 6 4 10 12])
;; => 12
(highest-rank [12 10 8 12 7 6 4 10 12 10])
;; => 12
(highest-rank [12 10 8 8 3 3 3 3 2 4 10 12 10])
;; => 3
