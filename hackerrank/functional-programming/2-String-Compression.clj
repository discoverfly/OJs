(ns clj-test.core)

(defn compress [s]
  (->> s
       (partition-by identity)
       (mapcat #(list (first %) (count %)))
       (remove #{1})
       (apply str)))

(defn -main []
  (let [s (read-line)]
    (println (compress s))))


