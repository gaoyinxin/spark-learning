import org.apache.spark.sql.SparkSession

object SparkTest extends App {
  val spark = SparkSession.builder
    .appName("Sample App")
    .master("spark://127.0.0.1:7077")
    .getOrCreate()
  val data = spark.sparkContext.parallelize(
    Seq("I like Spark", "Spark is awesome", "My first Spark job is working now and is counting down these words")
  )
  val filtered = data.filter(line => line.contains("awesome"))
  filtered.collect().foreach(print)
}
