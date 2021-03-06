(defproject prism-kafka-connect "0.1.0"
  :description "A service called prism-kafka-connect"
  :url "https://github.com/RallySoftware/prism-kafka-connect"
  :license "Copyright 2016 CA Technologies"
  :repositories [["confluent" "http://packages.confluent.io/maven"]]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.kafka/connect-api "1.1.0" :exclusions [org.slf4j/slf4j-log4j12
                                                                    org.apache/xerces]]
                 [io.confluent/kafka-connect-s3 "4.1.1" :exclusions [io.confluent/kafka-connect-storage-hive
                                                                     org.apache/xerces]]]

  :java-source-paths ["src/java/prism_kafka_connect"]
  :jar-name "prism-kafka-connect.jar"
  :uberjar-name "prism-kafka-connect-standalone.jar"

  :main prism-kafka-connect.core)
