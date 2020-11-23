name := "SparkTest"

version := "0.1"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.7",
  "org.apache.spark" %% "spark-sql" % "2.4.7"
)
