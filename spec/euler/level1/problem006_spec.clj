(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"
  (context "Sum of square"
    (it "3 gives 36?"
      (should= 36 (square-of-sum 3)))
    (it "Larger value to subtract square-of-sum from"
      (should= 25502500 (square-of-sum 100)))
    )
  (context "Square of sum"
    (it "3 gives 14"
      (should= 14 (sum-of-square 3)))
    (it "100 gives value to be subtracted from square-of-sum"
      (should= 338350 (sum-of-square 100)))
    )
  (context "Difference between sum-of-square and square-of-sum"
    (it "3 gives 22"
      (should= 22 (calc-difference 3)))
    (it "100 gives ?"
      (should= 25164150 (calc-difference 100)))
    )
  )

(run-specs)
