(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(focus-describe "Euler Problem #5"

                (context "mod over collection up to 20"
                  (it "2 gives 'false"
                    (should= false (mod-over-coll 2)))
                  (it "2 gives true"
                    (should= false (mod-over-coll 2520)))
                  (it "2 gives true"
                    (should= true (mod-over-coll 232792560)))
                  )
                #_(context "find smallest divisor from 1 to 20"
                  (it "up to 2 gives 2520"
                    (should= 232792560 (divisible-by-range?)))

                  )

                )

(run-specs)
