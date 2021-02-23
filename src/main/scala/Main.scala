

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Main {

  val sparkConf = new SparkConf()
    .setMaster("local[*]")
    .setAppName("spark-testing-example")
  val sc = new SparkContext(sparkConf)
  sc.setLogLevel("ERROR")


  def main(args:Array[String]): Unit ={

    val logData:RDD[String]= sc.textFile("/Users/apple/Desktop/akshay/spark_projects/SampleProject/src/data/sample.txt").cache()
    val dataRDD:RDD[(String, Int)] = WordCounter.count(logData)
    dataRDD.foreach(println)


  }
}
