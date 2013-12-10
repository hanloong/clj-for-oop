(def factorial
  (fn [n]
    (apply *
      (range 1
        (inc n)))))
(prn (range 1 5))
(prn (factorial 5))
