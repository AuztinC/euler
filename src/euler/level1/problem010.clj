(ns euler.level1.problem010)


(defn- prx [x]
  (prn "x: " x)
  x)

(defn prime? [num]
  (every? false? (map #(zero? (mod num %)) (filter odd? (range 2 num)))))

(defn primes-under [n]
  (loop [depth 3
         prime-coll []]))