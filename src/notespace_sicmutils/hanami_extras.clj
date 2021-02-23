(ns notespace-sicmutils.hanami-extras
  (:require [aerial.hanami.templates :as hanami-templates]
            [aerial.hanami.common :as hanami-common]))

;; Patching Hanami with our necessary plot types.

(def extended-xy-encoding
  (merge
   hanami-templates/xy-encoding
   {:x2 {:field     :X2
         :type      :XTYPE
         :bin       :XBIN
         :timeUnit  :XUNIT
         :axis      :XAXIS
         :scale     :XSCALE
         :sort      :XSORT
         :aggregate :XAGG}
    :y2 {:field     :Y2
         :type      :YTYPE
         :bin       :YBIN
         :timeUnit  :YUNIT
         :axis      :YAXIS
         :scale     :YSCALE
         :sort      :YSORT
         :aggregate :YAGG}}))

(swap! hanami-common/_defaults
       assoc
       :X2 "x2"
       :Y2 "y2"
       :ENCODING extended-xy-encoding)

(def rule-chart
  (assoc hanami-templates/view-base
         :mark "rule"))
