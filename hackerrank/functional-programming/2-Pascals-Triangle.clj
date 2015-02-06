
(defn next-row [xs]
  (map #(apply + %) (partition 2 1 (concat [0] xs [0]))))


(let [n (read-string (read-line))]
  (let [ys (take n (iterate next-row [1]))]
    (doseq [i ys]  (println (apply str (interpose \space i))))))
