(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (context "split into str coll"
    (it "number to string"
      (should= ["9" "8" "0" "1"] (->product-str [99 99])))
    )

  (context "evenly split reversed coll"
    (it "[9 8 0 1] to [ [98] [10] ]"
      (should= [["9""8"]["1""0"]] (->halves (->product-str [99 99]))))
    ;(it "111 111"111
    ;  (should= [["1""2"]["2""1"]] (subvec-str-coll [111 111])))
    (it "222 222"
      (should= [["4""9"]["4""8"]] (->halves (->product-str [222 222]))))
    (it "333 333"
      (should= [["1" "1" "0"] ["9" "8" "8"]] (->halves (->product-str [333 333]))))
    )

  (context "do they match?"
    (it "false double digit palindrome"
      (should= false (palindrome-check? [99 99])))
    (it "true double digit palindrome"
      (should= true (palindrome-check? [91 99])))
    )

  (context "max-palindrome-below"
    (it "highest 2 digit"
      (should= 9009  (max-palindrome-below 99)))
    (it "222"
      (should= 45954 (max-palindrome-below 222)))
    (it "333"
      (should=  95659 (max-palindrome-below 333)))
    (it "777"
      (should= 571175 (max-palindrome-below 777)))
    (it "999"
      (should= 906609 (max-palindrome-below 999)))
    )


  )

(run-specs)
