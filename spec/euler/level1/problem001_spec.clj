(ns euler.level1.problem001-spec
  (:require [euler.level1.problem001 :refer :all]
            [speclj.core :refer :all])
  )

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"
;
  (it "Solves #1"
    ;(should= 3 (euler-1 3))
    ;(should= 8 (euler-1 5))
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000))
    )



  )

(run-specs)
