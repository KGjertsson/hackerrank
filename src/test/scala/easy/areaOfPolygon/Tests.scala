package easy.areaOfPolygon

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite {

  test("test case 1") {
    def solution = new Solution()

    val testCase = "3\n1043 770\n551 990\n681 463"

    assert(solution.main(testCase) == 115342.0)
  }

  test("test case 2") {
    def solution = new Solution()

    val testCase = "8\n458 695\n621 483\n877 469\n1035 636\n1061 825\n875 1023\n645 1033\n485 853"

    assert(solution.main(testCase) == 255931.0)
  }

  test("test case 3") {
    def solution = new Solution()

    val testCase = "8\n909 423\n1056 778\n956 1013\n813 994\n614 962\n540 924\n395 846\n455 541"

    assert(solution.main(testCase) == 277068.0)
  }

  test("test case 4") {
    def solution = new Solution()

    val testCase = "12\n443 861\n470 506\n754 432\n910 446\n952 485\n1036 595\n1100 721\n1045 954\n947 1009\n" +
      "712 1095\n648 1092\n528 990"

    assert(solution.main(testCase) == 335883.5)
  }

}
