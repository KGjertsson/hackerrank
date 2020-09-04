package easy.perimeterOfPolygon

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite {

  test("test case 1") {
    def solution = new Solution()

    val testCase = "3\n1043 770\n551 990\n681 463"

    assert(solution.main(testCase) == 1556.3949033)
  }

  test("test case 2") {
    def solution = new Solution()

    val testCase = "8\n458 695\n621 483\n877 469\n1035 636\n1061 825\n875 1023\n645 1033\n485 853"

    assert(solution.main(testCase) == 1847.48055065)
  }

}
