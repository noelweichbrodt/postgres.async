(defproject alaisi/postgres.async "0.10.0-SNAPSHOT"
  :description "Asynchronous PostgreSQL Clojure client"
  :url "http://github.com/alaisi/postgres.async"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "http://github.com/alaisi/postgres.async.git"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [org.clojure/core.async "0.3.442"]
                 [com.github.alaisi.pgasync/postgres-async-driver "0.9"]
                 [cheshire "5.7.1" :scope "provided"]]
  :lein-release {:deploy-via :clojars}
  :global-vars {*warn-on-reflection* true}
  :target-path "target/%s")
