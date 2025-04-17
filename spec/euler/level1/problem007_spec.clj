(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  #_(context "can we get primes?"
    (it "first prime number - 2"
      (should= true (prime? 2)))
    (it "5"
      (should= true (prime? 5)))
    (it "7"
      (should= true (prime? 7)))
    (it "8"
      (should= false (prime? 8)))
    )
  #_(context "check prime-upto"
    (it "up to 10"
      (should= '(2 3 5 7) (find-primes-upto 10)))
    )
  #_(context "array of N primes"
    (it "1 gives me '(2) the first prime"
      (should= '(2) (number-of-primes 1)))
    (it "3 gives me '(2 3 5)"
      (should= '(2 3 5) (number-of-primes 3)))
    (it "10"
      (should= '(2 3 5 7 11 13 17 19 23 29) (number-of-primes 10)))
    )
                #_(it " gives 10,001? "
                  (should= 104743 (number-of-primes 10001)))
  )

(run-specs)
