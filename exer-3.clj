(def add-squares
  (fn [& numbers]
    (apply +
      (map * numbers numbers))))
(prn (add-squares 1 2 5))
