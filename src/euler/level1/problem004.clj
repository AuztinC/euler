(ns euler.level1.problem004
  (:require [clojure.string :as str]))

; ->something "creates a something"
; <-something "from something"
; a->b "converts from a to b

(defn ->product-str [coll]
  (-> (reduce * coll) str (str/split #"")))

(defn ->halves [str-coll]
  (let [len (quot (count str-coll) 2)]
    [(take len str-coll) (take len (reverse str-coll))]))

(defn palindrome-check? [coll]
  (let [subvec-col (-> coll ->product-str ->halves)]
    (= (first subvec-col) (second subvec-col))))


(defn max-palindrome-below [num]
  (->> (for [x (map inc (range 1 num))
             y (map inc (range (inc num)))]
         [(palindrome-check? [x y]) (* x y)])
       (filter first)
       sort
       last
       last
       )
  )

  #_(loop [i num
         max-product 0
         best-pair []]
    (if (< i 0)
      [best-pair max-product]
      (let [[best-product best-pair-inner]
            (loop [j i
                   local-max max-product
                   local-pair best-pair]
              (if (< j 0)
                [local-max local-pair]
                (let [prod (* i j) match (palindrome-check? [i j])]
                  (if (and match (> prod local-max))
                    (recur (dec j) prod [i j])
                    (recur (dec j) local-max local-pair)))))]
        (recur (dec i) best-product best-pair-inner))))
#_(loop [i num
         max-product 0
         best-pair []]
    (if (< i 500)
      [best-pair max-product]
      (let [[best-product best-pair-inner]
            (loop [j i
                   local-max max-product
                   local-pair best-pair]
              (if (< j 500)
                [local-max local-pair]
                (let [prod (* i j) match (palindrome-check? [i j])]
                  (if (and match (> prod local-max))
                    (recur (dec j) prod [i j])
                    (recur (dec j) local-max local-pair)))))]
        (recur (dec i) best-product best-pair-inner))))

#_(defn recur-match-check [num-col]
    (loop [n-col num-col idx true]
      (if (match-check n-col)
        [n-col (reduce * n-col)]
        (if (true? idx)
          (recur [(- (first n-col) 1) (last n-col)] false)
          (recur [(first n-col) (- (last n-col) 1)] true)))))


