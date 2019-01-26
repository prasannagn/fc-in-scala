package answer

import GettingStarted._
import org.scalatest.{FunSuite, Matchers}

class GettingStartedSpec extends FunSuite with Matchers {

  //0 1 1 2 3
  test("fib 0") {
    val actual = fib(0)
    actual shouldBe 0
  }

  test("fib 1") {
    val actual = fib(1)
    actual shouldBe 1
  }

  test("fib 2") {
    val actual = fib(2)
    actual shouldBe 1
  }

  test("fib 3") {
    val actual = fib(3)
    actual shouldBe 2
  }

  test("fib 4") {
    val actual = fib(4)
    actual shouldBe 3
  }

  test("fib 5") {
    val actual = fib(5)
    actual shouldBe 5
  }


  test("is sorted") {
    isSorted(Array(0,1,2,3,4), (a:Int,b:Int) => a>b) shouldBe true
    isSorted(Array(0,1,2,3,4), (a:Int,b:Int) => a<b) shouldBe false
  }


}
