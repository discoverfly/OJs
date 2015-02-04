
(defn fib
  ([n] (fib 0 1 n))
  ([a b n]
   (if (= n 1) a
       (fib b (+ a b) (dec n)))))

(let [n (read-string (read-line))]
  (println (fib n)))
