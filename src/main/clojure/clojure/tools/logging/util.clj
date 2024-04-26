(ns clojure.tools.logging.util)

(defn maybe-defer
  [x]
  (if-not (instance? clojure.lang.IDeref x)
    x
    (.deref ^clojure.lang.IDeref x)))
