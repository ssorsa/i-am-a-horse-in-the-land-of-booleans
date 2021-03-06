(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))
;(if (A? $a)
;(true)
;(false)
(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0) (* -1 x)x)
)

(defn divides? [divisor n]
  (if (== (mod n divisor) 0 ) true false )
)

(defn fizzbuzz [n]
(cond 
  (divides? 15 n) "gotcha!"    
  (divides? 3 n) "fizz"
  (divides? 5 n) "buzz"
 :else "" 
  )
)

(defn teen? [age]
(<= 13 age 19)
  )

(defn not-teen? [age]
  (not(teen? age))
)

(defn generic-doublificate [x]
 (cond
  (number? x) (* 2 x)
  (empty? x) nil
   ;list | vector
  (list? x) (* (count x) 2)
  (vector? x) (* (count x) 2)
   :else true
  )
)

(defn leap-year? [year]
(
if(divides? 400 year) true (
 if(divides? 4 year)
 (if (divides? 100 year)false true)
 false
  )
)
)

; '_______'
