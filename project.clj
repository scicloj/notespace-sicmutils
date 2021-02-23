(defproject notespace-sicmutils "0.16.2"
  :description "A Notespace extension for rendering Sicmutils math nicely."
  :url "github.com/scicloj/notespace-sicmutils"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]})
