(ns euler.level1.problem009)

#_(find 3 numbers that add to 1000 and check if they are pythagorean-triplets)
(defn- prx [x]
  (prn "x: " x)
  x)
(defn pythagorean-triplet? [a b c]
  (and (< a b c) (= (+ (* a a) (* b b)) (* c c))))

(defn test-triplets-under [sum]
  (first (for [a (range 1 sum)
        b (range (inc a) (- sum a))
    :let [c (- sum a b)]
        :when (pythagorean-triplet? a b c)]
           (* a b c))))
