(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(focus-describe "Euler Problem #9"

  (context "pythagorean-triplet?"
    (it "checking for pythagorean-triplet"
      (should= true (pythagorean-triplet? 3 4 5)))
    )
                (context "check for p-triplets under 100"
                  (it "checking for pythagorean-triplet"
                    (should= 60 (test-triplets-under 12)))
                  (it "checking for pythagorean-triplet"
                    (should= 31875000 (test-triplets-under 1000)))
                  )
  )

(run-specs)
