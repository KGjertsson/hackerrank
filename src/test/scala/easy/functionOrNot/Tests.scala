package easy.functionOrNot

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite {

  test("test case 1") {
    def solution = new Solution()

    val testCase = "2\n3\n1 1\n2 2\n3 3\n4\n1 2\n2 4\n3 6\n4 8"

    assert(solution.solve(testCase) == "YES\nYES")
  }

  test("test case 2") {
    def solution = new Solution()

    val testCase = "2\n3\n1 1\n2 2\n3 3\n4\n1 2\n2 4\n3 6\n4 8"

    assert(solution.solve(testCase) == "YES\nYES")
  }

}
