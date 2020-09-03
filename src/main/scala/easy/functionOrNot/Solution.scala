package easy.functionOrNot

class Solution {

  def solve(testCases: Seq[(Int, Int)]): String =
    testCases
      .groupBy { case (input, _) => input }
      .filter { case (_, outputs) => outputs.map { case (_, output) => output }.distinct.length > 1 }.toSeq
    match {
      case output if output.nonEmpty => "YES"
      case _ => "NO"
    }

  def main(args: Array[String]) {

    args

  }

}
