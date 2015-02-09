(ns clj-test.core)

(defn read-list []
  (read-string (apply str (concat "(" (read-line) ")"))))

(defn get-ans [xs m]
  (->> xs
       (map-indexed list)
       (group-by second)
       (filter #(<= m (count (second %))))
       (map #(list (first %) (->> % second first first)))
       (sort-by second)
       (map first)
       (interpose \space)
       (apply str)))

(defn -main []
  (let [n (read-string (read-line))]
    (dotimes [_ n]
      (let [[len m] (read-list)
            xs (read-list)
            ans (get-ans xs m)]
        (if (seq ans)
          (println ans)
          (println -1))))))        
