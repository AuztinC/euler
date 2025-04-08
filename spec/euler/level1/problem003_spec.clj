(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (context "Factors"
    (it "base case"
      (should= [2] (factors 2)))

    (it "10"
      (should= [2 5] (factors 10)))
    )

  (context "Prime-factors"
    (it "base case"
      (should= [2] (prime-factors 2)))

    (it "13195"
      (should= [5 7 13 29] (prime-factors 13195)))

    ;(it "Hello?"
    ;  (println "Running hello test...")
    ;  (should= [1] (prime-factors 600851475143)))

    )


  (it "Solves #3"
    (should= 6857 (euler-3 600851475143)))
  )

(run-specs)
