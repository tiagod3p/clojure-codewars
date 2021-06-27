;; The rgb function is incomplete.
;; Complete it so that passing in RGB decimal values
;; will result in a hexadecimal representation being returned.
;; Valid decimal values for RGB are 0 - 255.
;; Any values that fall out of that range must be rounded to the closest valid value.

;;Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

;;The following are examples of expected output values:

;; (rgb 255 255 255) - returns FFFFFF
;; (rgb 255 255 300) - returns FFFFFF
;; (rgb 0 0 0) - returns 000000
;; (rgb 148 0 211) - returns 9400D3




(ns rgb-to-hex-conversion)

(defn dec-to-hex [rgb-map n] (or (rgb-map n) n))

(defmulti rgb-to-hex (fn [_ n] (and 
                                 (>= n 0)
                                 (<= n 255) 
                                 )))

(defmethod rgb-to-hex true [rgb-map n]  
  (let [
        firsthex  (
                   dec-to-hex rgb-map (int (Math/floor (/ n 16)))
                   )
        secondhex (
                   dec-to-hex rgb-map (* 
                                        (-
                                          (/ n 16) 
                                          (int (Math/floor (/ n 16)))) 
                                        16)
                   )
        ]
    (str firsthex secondhex)))

(defmethod rgb-to-hex false [rgb-map n] (if (< n 0) "00" "FF"))

(defn rgb [r g b]
  (def rgb-map {10 "A" 11 "B" 12 "C" 13 "D" 14 "E" 15 "F"})
  (reduce
    (fn [acc x] (str acc (rgb-to-hex rgb-map x)))
    ""
    [r g b] ))

(rgb 199 182 181)
;; => "C7B6B5"

(rgb 255 255 255)
;; => "FFFFFF"

(rgb 255 255 300)
;; => "FFFFFF"

(rgb 0 0 0)
;; => "000000"

(rgb 148 0 211)
;; => "9400D3"
