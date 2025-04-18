(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

#_(describe "Euler Problem #10"

  (context "is it prime?"
    (it "2 true"
      (should= true (prime? 2)))
    (it "3 true"
      (should= true (prime? 3)))
    (it "4 false"
      (should= false (prime? 4)))
    (it "5 true"
      (should= true (prime? 5)))
    (it "6 false"
      (should= false (prime? 6)))
    )
                (context "list primes under #"
                  (it "10 gives (2 3 5 7)"
                    (should= '(2 3 5 7) (primes-under 10)))
                  )
  )

(run-specs)
