(ns euler.level1.problem004
  (:require [clojure.string :as str]))

#_(
    A palindromic number reads the same both ways.
      The largest palindrome made from the product of two
      2 digit numbers is
      9009 = 91 x 99.

      Find the largest palindrome made from the product of two
      3 digit numbers.

      if count of [] is odd, have to move pointers
      else split at middle, reverse one side and compare.
   )

(defn product [[n1 n2]]
  (* n1 n2))

(defn product-to-str-coll [coll]
  (str/split (str (product coll)) #""))

(defn subvec-str-coll [num-col]
  (let [str-col (product-to-str-coll num-col)]
    (cond
      (= 5 (count str-col)) [(subvec str-col 0 2)
       (vec (reverse (subvec str-col  3)))]
      (= 4 (count str-col)) [(subvec str-col 0 2)
       (vec (reverse (subvec str-col (count num-col))))]
      :else [(subvec str-col 0 3)
             (vec (reverse (subvec str-col 3)))]
      )
    ))

(defn match-check [coll]
  (let [subvec-col (subvec-str-coll coll)]
    (every? true? (map #(= (first subvec-col) %) subvec-col))))

(defn recur-match-check [num-col]
  (loop [n-col num-col max-pal 0]
    (if (and (match-check n-col) (< max-pal (reduce * n-col)))
      [n-col (reduce * n-col)]
    (recur [(- (first n-col) 1) (last n-col)] max-pal))))

(defn euler-4 [n]
  n)
