import com.akshay.sample.MyUtils
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class TestDemo extends AnyFlatSpec with Matchers {
  "MyUtils" should "Divide two number" in {
    assert(MyUtils.divide(10,5) === 2)
  }
  it should "Adults user can Vote" in {
    assert(MyUtils.canVote(19) === true)
  }
  it should "Throw ArithmeticException if attempted to divide zero" in {
    a[java.lang.ArithmeticException] should be thrownBy {
      MyUtils.divide(10, 0)
    }
  }
    it should "Minor user can not Vote" in {
      assert(MyUtils.canVote(9) === false)
    }




}