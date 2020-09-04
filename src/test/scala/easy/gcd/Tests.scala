package easy.gcd

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Tests extends AnyFunSuite{


  test("test case 1") {
    def solution = new Solution();

    assert(solution.gcd(2, 3) == 1)
  }



}
