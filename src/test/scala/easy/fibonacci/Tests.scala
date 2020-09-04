package easy.fibonacci

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite {

  test("test case 1") {
    def solution = new Solution()

    assert(solution.fibonacci(3) == 1)
  }

  test("test case 2") {
    def solution = new Solution()

    assert(solution.fibonacci(4) == 2)
  }

  test("test case 3") {
    def solution = new Solution()

    assert(solution.fibonacci(5) == 3)
  }

}
