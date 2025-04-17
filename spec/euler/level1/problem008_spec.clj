(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8

(focus-describe "Euler Problem #8"

  #_(context "get product of first 13"
    (it "first 13 from seq"
      (should= 5000940 (sum-thirteen 73167176531330624919225119674426574742355349194934)))
    )
                (context "climbing product"
                  (it "inc pointer"
                    (should= [23514624000 '(5 5 7 6 6 8 9 6 6 4 8 9 5)] (step-forward 1000)))
                  )
  )

(run-specs)
