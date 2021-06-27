;; If we list all the natural numbers below 10 that are
;; multiples of 3 or 5, we get 3, 5, 6 and 9.
;; The sum of these multiples is 23.

;; Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

;; Note: If the number is a multiple of both 3 and 5, only count it once.
;; Also, if a number is negative, return 0(for languages that do have them)

;; Examples

;; (solution 10) => 23
;; (solution 20) => 78
;; (solution 200) => 9168

(ns multiples-of-3-or-5)

(defn solution [number]
  (reduce
    +
    (filter
      (fn[x] (or (= 0 (rem x 3)) (= 0 (rem x 5)) ))
      (range 3 number))
    )
  )

(solution 10);; => 23
(solution 20);; => 78
(solution 200);; => 9168
