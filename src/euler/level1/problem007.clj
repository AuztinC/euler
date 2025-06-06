(ns euler.level1.problem007)

#_(10,001 st prime number - only test odds
    if count of collection of primes == 10,001)
(defn ->inspect [x]
  (prn x)
  x)
#_(defn prime? [depth prime-col]
  (every? false? (map #(zero? (mod depth %)) prime-col)))
(defn prime? [n]
  (every? false? (map #(zero? (mod n %)) (range 2 n))))

(def primes (filter prime? (iterate inc 2)))

#_(defn find-primes [n]
  (filter #(if (prime? %) %) (map inc (range 1 n))))

(defn number-of-primes [n]
  (loop [depth 3 prime-col (list 2)]
    (if (= (count prime-col) n)
      (first prime-col)
      (if (prime? depth prime-col)
        (recur (+ 2 depth) (conj prime-col depth))
        (recur (+ 2 depth) prime-col)
        ))))

