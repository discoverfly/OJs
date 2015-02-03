(let [f (fn [a b]
          (loop [a a b b]
            (if (zero? b) a
                (recur b (rem a b)))))
      [m n] (map read-string (re-seq #"\d+" (read-line)))]
  (println (f m n)))
