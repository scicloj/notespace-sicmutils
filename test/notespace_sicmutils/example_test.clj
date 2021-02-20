(ns notespace-sicmutils.example-test
  (:require [notespace.kinds :as kind]
            [notespace-sicmutils.setup]
            [sicmutils.env]))

^kind/hidden
(sicmutils.env/bootstrap-repl!)

["# Chapter 1
Let us compute something:"]

(log (/ (tan 'x)))

