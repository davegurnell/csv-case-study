import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {
  "this test" should "pass" in {
    1 + 1 should be(2)
  }
}
