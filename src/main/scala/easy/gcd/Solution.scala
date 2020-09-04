package easy.gcd

class Solution {

  def gcd(x: Int, y: Int): Int =
    x - y match {
      case sum if sum == 0 => x
      case sum if sum > 0 => gcd(x - y, y)
      case _ => gcd(x, y - x)
    }

}
