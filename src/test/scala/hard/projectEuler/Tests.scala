package hard.projectEuler

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite {

  test("test case dummy 1") {
    def solution = new Solution()

    assert(solution.main(3, 50) == 0)
  }

  test("test case dummy 2") {
    def solution = new Solution()

    assert(solution.main(4, 50) == 0)
  }

  test("test case dummy 3") {
    def solution = new Solution()

    assert(solution.main(4, 5) == 2)
  }

  test("test case 0") {
    def solution = new Solution()

    assert(solution.main(6, 50) == 0)
  }

  test("test case 1") {
    def solution = new Solution()

    assert(solution.main(10, 50) == 21)
  }

}
