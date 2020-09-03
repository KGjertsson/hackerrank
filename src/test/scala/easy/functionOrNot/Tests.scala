package easy.functionOrNot

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite {

  test("todo") {
    def solution = new Solution()

    assert(solution.square(3) == 9)
  }

}
