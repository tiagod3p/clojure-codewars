;; Implement the function unique_in_order which takes as argument
;; a sequence and returns a list of items without any elements
;; with the same value next to each other and preserving the original order of elements.

;; For example:

;; uniqueInOrder("AAAABBBCCDAABBB") == {'A', 'B', 'C', 'D', 'A', 'B'}
;; uniqueInOrder("ABBCcAD")         == {'A', 'B', 'C', 'c', 'A', 'D'}
;; uniqueInOrder([1,2,2,3,3])       == {1, 2, 3}

(ns unique-in-order)

(defn unique-in-order-func [sequence]
  (dedupe sequence)  
  )

(unique-in-order-func "AAAABBBCCDAABBB");; => (\A \B \C \D \A \B)
(unique-in-order-func "ABBCcAD");; => (\A \B \C \c \A \D)
(unique-in-order-func [1 2 2 3 3]);; => (1 2 3)
