(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

  #_(context "is it prime?"
    (it "2 true"
      (should= true (prime? 2)))
    (it "3 true"
      (should= true (prime? 3)))
    #_(it "4 false"
      (should= false (prime? 4)))
    (it "5 true"
      (should= true (prime? 5)))
    (it "6 false"
      (should= false (prime? 6)))
    )
                (context "list primes under #, get sum when depth is reached."
                  (it "10 gives (2 3 5 7), adds them = 17"
                    (should= 17 (primes-under 10)))
                  (it "100,000 gives 454396537"
                    (should= 454396537 (primes-under 100000)))
                  (it "2M gives 142913828922"
                    (should= 142913828922 (primes-under 2000000)))
                  )
  )

(run-specs)
