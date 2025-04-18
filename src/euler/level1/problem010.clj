(ns euler.level1.problem010)


(defn- prx [x]
  (prn "x: " x)
  x)

(defn prime? [num prime-coll]
  (not-any? #(zero? (mod num %)) (take-while #(<= % (Math/sqrt num)) prime-coll)))

(defn primes-under [limit]
  (loop [depth 3 prime-coll [2]]
    (if (>= depth limit)
      (reduce + prime-coll)
      (if (prime? depth prime-coll)
        (recur (+ depth 2) (conj prime-coll depth ))
        (recur (+ depth 2) prime-coll)))))