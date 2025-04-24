(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "asserts if prime"
    (should (prime? 2))
    (should (prime? 3))
    (should-not (prime? 4))
    (should (prime? 5))
    (should-not (prime? 6))
    (should (prime? 7))
    (should-not (prime? 8))
    (should-not (prime? 9))
    (should-not (prime? 10))
    (should (prime? 6899))
    (should (prime? 33391))
    )

  (it "finds nth prime"
    (should= 2 (nth primes 0))
    (should= 3 (nth primes 1))
    (should= 5 (nth primes 2))
    (should= 7 (nth primes 3))
    (should= 13 (nth primes 5))
    (should= 104743 (nth primes 10000)))
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
