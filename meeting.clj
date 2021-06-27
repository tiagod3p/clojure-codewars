;; John has invited some friends. His list is:

;; s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

;; Could you make a program that
;; makes this string uppercase
;; gives it sorted in alphabetical order by last name.

;; When the last names are the same, sort them by first name.
;; Last name and first name of a guest come in the result between parentheses separated by a comma.

;; So the result of function meeting(s) will be:

;; "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"

;; It can happen that in two distinct families with the same family name two people have the same first name too.

(ns meeting (:use [clojure.string :only (join upper-case split)]))

(defn convert-name [x]
  (let [converted-name (join
                         ", "
                         (-> x (split #":") rseq))
        ]
    (str "("  converted-name ")" )))

(defn meeting-func [s]
  (-> (map convert-name (-> s upper-case (split #";")))
      sort
      join)
  )

(meeting-func "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill")
;; => "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
