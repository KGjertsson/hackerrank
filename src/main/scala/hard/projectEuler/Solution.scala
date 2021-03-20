package hard.projectEuler

// 1 4 27 256
// 1 + 4
// 1 + 27
// 1 + 256
// 1 + 4 + 27
// 1 + 4 + 256
// 4 + 27
// 4 + 256
//

// 1, [4, 27, 256]
// 1 + 4        = 5
// 1 + 27       = 28
// 1 + 256      = 257
// 5 + 27       = 32
// 5 + 256      = 261
// 32 + 256     = 288

// 4, [27, 256]
// 4 + 27       = 31
// 4 + 256      = 260
// 31 + 256     = 287

// 27, [256]
// 27 + 256     = 283

// [5, 28, 257, 32, 261, 288, 31, 260, 287, 283]


class Solution {

  def permutations(current: Long, numbers: Seq[Long]): Seq[Long] =
    numbers match {
      case numbers if numbers.nonEmpty => numbers.map(_ + current) ++ permutations(current + numbers.head, numbers.tail)
      case _ => Seq.empty
    }

  def main(n: Int, k: Int): Int = {
    val subsets = Range(1, n + 1)
      .map(subset => Math.pow(subset, subset))
      .map(_.toLong)

    subsets
      .flatMap(element => permutations(element, subsets.filter(_ > element)))
      .count(element => element % k == 0)
  }

}

