import org.apache.spark.rdd.RDD

object WordCounter {


  def count(lines:RDD[String]): RDD[(String, Int)] ={
val wordCount = lines.flatMap(l => l.split(" ")).map(w => (w,1)).reduceByKey(_ +_)
    wordCount
  }

}
