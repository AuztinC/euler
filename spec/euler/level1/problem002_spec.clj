(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  ;(context "fib-seq calculates"
  ;
  ;  (it "base case"
  ;    (should= [1] (fib-seq 1))
  ;    (should= [1 2] (fib-seq 2)))
  ;
  ;  (it "3 fibs"
  ;    (should= [1 2 3] (fib-seq 3)))
  ;
  ;  (it "5 fibs"
  ;    (should= [1 2 3 5] (fib-seq 5)))
  ;  (it "10 fibs"
  ;    (should= [1 2 3 5 8] (fib-seq 10)))
  ;  )
  ;
  ;(context "fib-filter"
  ;  (it "base case"
  ;    (should= [2] (fib-filter [1 2])))
  ;  (it "10 fibs"
  ;    (should= [2 8] (fib-filter [1 2 3 5 8])))
  ;  )



  (it "Solves #2"
    (should= 4613732 (euler-2 4000000))
    ;(should= -1 (euler-2 -1))
    )
  )

(run-specs)
