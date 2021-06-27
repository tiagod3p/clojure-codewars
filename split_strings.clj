;; Complete the solution so that it splits
;; the string into pairs of two characters.
;; If the string contains an odd number of characters
;; then it should replace the missing second character
;; of the final pair with an underscore ('_').

;; Examples:

;; (solution "abc") ; => ["ab" "c_"]
;; (solution "abcd") ; => ["ab" "cd"]


(ns split-strings)

(defn solution [s]
  (def response (re-seq #".{1,2}" s))
  (cond (= 2 (count (last response)))
        response
        :else (assoc (into [] response) (- (count response) 1) (str (last response) "_")))
  )

(solution "abc");; => ["ab" "c_"]
(solution "abcd");; => ("ab" "cd")
