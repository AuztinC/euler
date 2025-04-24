(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(focus-describe "Euler Problem #12"
  (it "test prime-factors"
    (should= {2 1, 3 1} (prime-factors 6))
    (should= {3 2} (prime-factors 9))
    (should= {2 2, 3 2} (prime-factors 36))
    )
  (it "returns number of divisors"
    (should= 1 (count-divisors 1))
    (should= 2 (count-divisors 3))
    (should= 4 (count-divisors 6))
    (should= 6 (count-divisors 28))
    (should= 12 (count-divisors 10004))
    (should= 36 (count-divisors 2016))
    )

  (it "find triangle numbers"
    (should= 1 (nth triangles 1))
    (should= 3 (nth triangles 2))
    (should= 6 (nth triangles 3))
    (should= 78 (nth triangles 12))
    )
  (it "filter triangle with # of divisors"
    (should= 3 (num-of-divisors 2))
    (should= 28 (num-of-divisors 6))
    (should= 36 (num-of-divisors 8))
    (should= 528 (num-of-divisors 20))
    (should= 2016 (num-of-divisors 30))
    (should= 73920 (num-of-divisors 105))
    (should= 2031120 (num-of-divisors 200))
    (should= 76576500 (num-of-divisors 500))
    )

  )
(run-specs)
