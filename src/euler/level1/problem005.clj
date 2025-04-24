(ns euler.level1.problem005)

#_(2520 is the smallest number that can be divided by each of the
    numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly
    divisible by all of the numbers from 1 to 20 ?

    THOUGHTS
    range from 1 - 20
    start from 2520 counting up
    if (ever? true? (mod bigint (every? range 1 - 20)))     ; store in coll ex:[true true false true]
    the first 'false' stop modding the coll
    )

(defn divisible-by-all? [coll dividend]
  (every? zero? (map #(mod dividend %) coll)))


(defn lcm-to [n]
  (loop [smallest-divisor 10]
    (if (true? (divisible-by-all? (range 1 n) smallest-divisor))
      smallest-divisor
      (recur (+ smallest-divisor 2)))))

