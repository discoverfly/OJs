(ns clj-test.core)

(defn read-list []
  (read-string (apply str (concat "(" (read-line) ")"))))

(defn -main []
  (->> (read-line)
       distinct
       (apply str)
       println))
         
