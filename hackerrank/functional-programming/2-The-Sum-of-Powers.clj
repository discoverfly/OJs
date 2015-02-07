
(let [n (read-string (read-line))
      m (read-string (read-line))
      int-power (fn [a b]
                  (nth (iterate #(*' a %) 1) b))
      dp (fn recur-dp [i ys m n]
           (if (or (= i n) (> (int-power i m) n)) ys
               (let [v (int-power i m)
                     tmp-update (fn [j]
                                  (if (>= j v)
                                    (+ (nth ys j) (nth ys (- j v)))
                                    (nth ys j)))
                     newys (map tmp-update (range (inc n)))]
                 (recur-dp (inc i) newys m n))))
      ans (fn [n m]
            (nth (dp 1 (cons 1 (repeat n 0)) m n) n))]
  (println (ans n m)))
