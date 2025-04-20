(ns euler.level1.problem011-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem011 :refer :all]))

; https://projecteuler.net/problem=11

(focus-describe "Euler Problem #11"

  #_(context "build 20x20 grid"
    (it "turns string into grid with 20 length sub vectors"
      (should= -1 (clean-number-string)))
    )
  (context "check horizontal"
    (it "product of first 4 in first row"
      (should= 34144 (horizontal 0 0)))
    (it "product of 2nd 4 in first row"
      (should= 162184 (horizontal 1 0)))
    )
  (context "check vertical"
    (it "product of first 4 in first vertical"
      (should= 1651104 (vertical 0 0)))
    )
  (context "check diagonal-down"
    (it "product of first 4 in first diagonal-down"
      (should= 279496 (diagonal-down 0 0)))
    )
  (context "check diagonal-up"
    (it "product of first 4 in first diagonal-up"
      (should= 24468444 (diagonal-up 0 3)))
    )
  (context "give greatest product of 4 horizontal checks"
    (it "greatest horizontal product"
      (should= 48477312 (horizontal-test)))
    )
  (context "greatest vertical product"
    (it "find product"
      (should= 51267216 (vertical-test)))
    )
  (context "greatest diagonal-down product"
    (it "find product"
      (should= 40304286 (diagonal-down-test)))
    )
  (context "greatest diagonal-up product"
    (it "find product"
      (should= 70600674 (diagonal-up-test)))
    )
  (context "greatest product"
    (it "whole-board"
      (should= 70600674 (find-largest-product)))
    )
  )

(run-specs)
