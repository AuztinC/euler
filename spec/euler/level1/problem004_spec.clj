(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (context "get product"
    (it "1 x 1"
      (should= 1 (product [1 1])))
    (it "9 x 9 = 81"
      (should= 9801 (product [99 99])))
    )

  (context "split into str coll"
    (it "number to string"
      (should= ["9" "8" "0" "1"] (product-to-str-coll [99 99])))
    )

  (context "evenly split reversed coll"
    (it "[9 8 0 1] to [ [98] [01] ]"
      (should= [["9""8"]["1""0"]] (subvec-str-coll [99 99])))
    ;(it "111 111"111
    ;  (should= [["1""2"]["2""1"]] (subvec-str-coll [111 111])))
    (it "222 222"
      (should= [["4""9"]["4""8"]] (subvec-str-coll [222 222])))
    (it "222 222"
      (should= [["1" "1" "0"] ["9" "8" "8"]] (subvec-str-coll [333 333])))
    )

  (context "do they match?"
    (it "false double digit palindrome"
      (should= false (match-check [99 99])))
    (it "true double digit palindrome"
      (should= true (match-check [91 99])))
    )

  (context "recursively check for match"
    (it "highest 2 digit"
      (should= [[91 99] 9009] (recur-match-check [99 99])))
    (it "222"
      (should= [[207 222] 45954] (recur-match-check [222 222])))
    (it "333"
      (should=  [[273 333] 90909]  (recur-match-check [333 333])))
    (it "999"
      (should=  [[91 999] 90909]   (recur-match-check [999 999])))
    (it "888"
      (should=  [[737 888] 654456]   (recur-match-check [888 888])))

    )

  )

(run-specs)
