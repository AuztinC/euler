(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (context "mod over collection up to 20"
    (it "2 gives 'false"
      (should-not (divisible-by-all? (range 1 20) 2)))
    (it "2 gives true"
      (should-not (divisible-by-all? (range 1 20) 2520)))
    (it "2 gives true"
      (should (divisible-by-all? (range 1 20) 232792560)))
    );
  (context "find smallest divisor from 1 to 20"
      (it "up to 2 gives 2520"
        (should= 232792560 (lcm-to 20)))

      )

  )

(run-specs)
