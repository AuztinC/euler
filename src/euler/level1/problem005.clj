(ns euler.level1.problem005)

#_(2520 is the smallest number that can be divided by each of the
    numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly
    divisible by all of the numbers from 1 to 20 ?

    THOUGHTS
    range from 1 - 20
    start from 2520 counting up
    if (ever? true? (mod bigint (every? range 1 - 20))) ; store in coll ex:[true true false true]
    the first 'false' stop modding the coll
      )

(defn mod-over-coll [test-num]
    (every? true? (map #(zero? (mod test-num %)) (range 1 (inc 20)))))


(defn divisible-by-range? []
    (loop [smallest-divisor 10]
        (if (true? (mod-over-coll smallest-divisor))
            smallest-divisor
            (recur (+ smallest-divisor 2)))))

