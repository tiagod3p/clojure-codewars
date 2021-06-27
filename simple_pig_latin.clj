;; Move the first letter of each word to the end of it,
;; then add "ay" to the end of the word.
;; Leave punctuation marks untouched.

;; Examples

;; (pig-it "Pig latin is cool") - returns "igPay atinlay siay oolcay"
;; (pig-it "Hello world !")     - returns "elloHay orldway !"



(ns simple-pig-latin)

(defn pig-it [s] 
  (->> (clojure.string/split s #" ")
       (map (fn [word] 
              (if (not (Character/isLetter (first word)))
                word
                (str (subs word 1) (subs word 0 1) "ay" ))
              ))
       (clojure.string/join #" ")
       )
  )

(pig-it "Pig latin is cool")
;; => "igPay atinlay siay oolcay"

(pig-it "Hello world !")
;; => "elloHay orldway !"
