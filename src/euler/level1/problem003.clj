(ns euler.level1.problem003)


;The prime factors of 13195 are 5, 7, 13, 29

;What is the largest prime factor of the number 600851475143?


(defn factors [n]
  (if (= n 2)
    [2]
    (->> (range 2 (inc (Math/sqrt n)))
         (filter #(zero? (mod n %)))
         (mapcat #(let [pair (/ n %)]
                    (if (= % pair)
                      [%]
                      [% pair]))))))

; this is my function that wouldn't pass the base cases
;(defn factors [n]
;  (if (= 2 n) [n]
;              (filter
;                (fn [nn] (zero? (mod n nn)))
;                (range 2 (inc (Math/sqrt n))))))

(defn prime? [n]
  (if (= n 2)
    [2]
    (not-any? (fn [nn] (zero? (mod n nn))) (range 2 (inc (Math/sqrt n))))))

(defn prime-factors [n]
  (filter prime? (factors n)))

(defn euler-3 [n]
  (last (prime-factors n)))
