package easy.functionOrNot

class Solution {

  def solve(testCases: Seq[(Int, Int)]): String =
    testCases
      .groupBy { case (input, _) => input }
      .map { case (_, outputs) => outputs.map { case (_, output) => output } }.toSeq
      .filter(output => output.length == output.distinct.length)
    match {
      case output if output.nonEmpty => "YES"
      case _ => "NO"
    }

  def main(args: Array[String]) {

  }

}
