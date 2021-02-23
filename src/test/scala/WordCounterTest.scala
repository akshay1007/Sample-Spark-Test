import com.holdenkarau.spark.testing.{RDDComparisons, SharedSparkContext}
import org.apache.spark.rdd.RDD
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class WordCounterTest extends AnyFlatSpec with Matchers with SharedSparkContext with RDDComparisons
{
//var sc:SparkContext = _
//  before{
//    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("test-wordcount")
//    sc = new SparkContext(sparkConf)
//  }
//
//  after{
//    sc.stop()
//  }

  behavior of "Words counter"
it should "count words in a text " in {
  val text =
    "Spark Spark Word Word Word Text Text".stripMargin


  val inputRdd: RDD[String] = sc.parallelize(List(text))
  print("inputRdd =====>"+inputRdd.foreach((println)))
  val expectedRdd: RDD[(String, Int)] = sc.parallelize(List(("Spark", 2),("Word",3),("Text",2)))

  val resRdd: RDD[(String, Int)] = WordCounter.count(inputRdd)
  resRdd.collect()
  assert(None === compareRDD(resRdd, expectedRdd))

}


}
