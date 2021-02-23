(ns notespace-sicmutils.setup
  (:require [notespace.behavior]
            [notespace.api]
            [sicmutils.env :as env]))

(env/bootstrap-repl!)

(extend-protocol notespace.behavior/Behaving
  sicmutils.expression.Literal
  (->behavior [_]
    {:render-src?   true
     :value->hiccup (fn [v]
                      [:p/math
                       (-> v
                           simplify
                           ->TeX)])}))

(extend-protocol notespace.behavior/Behaving
  sicmutils.structure.Structure
  (->behavior [_]
    {:render-src?   true
     :value->hiccup (fn [v]
                      [:p/math
                       (-> v
                           simplify
                           ->TeX)])}))
