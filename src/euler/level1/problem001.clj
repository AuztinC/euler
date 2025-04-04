(ns euler.level1.problem001)

; (mod 5 0) => remainder of 5 / 0 = ERROR
; (mod 5 1) => remainder of 5 / 1 = 0
; (mod 5 2) => remainder of 5 / 2 = 1
; (mod 5 3) => remainder of 5 / 3 = 2
; (mod 5 4) => remainder of 5 / 4 = 1
; (mod 5 5) => remainder of 5 / 5 = 0

; m is divisible by n if (mod m n) is 0
; m is divisible by 3 id (mod m 3) is 0

(defn euler-1 [n]
  (->> (range n)
       (filter (fn [x] (or (= 0 (mod x 3)) (= 0 (mod x 5)))))
       (reduce +)))
