(ns euler.level1.problem006)

#_(Find the difference between the sum of the squares
        of the first one hundred natural numbers
        and the square of the sum.
        add 1 to 100 and square - sum of the squared value of each 1 to 100)

(def range-to #(map inc (range %)))

(defn square-of-sum [n]
 (let [sum (reduce + (range-to n))]
  (* sum sum )))

(defn sum-of-square [n]
 (let [squared-total (reduce + (map #(* % %)(range-to n)))]
  squared-total))

(defn calc-difference [n]
  (- (square-of-sum n) (sum-of-square n)))