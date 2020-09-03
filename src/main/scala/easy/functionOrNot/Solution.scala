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

  def main(arg: String) {
    val abc = arg.split("\n").tail.toSeq
      .foldLeft(Seq.empty[(String, Seq[String])])((acc, element) =>
        element match {
          case newIndex if newIndex.length == 1 => acc ++ Seq((newIndex, Seq.empty[String]))
          case testPair => Seq(acc.splitAt(acc.length - 1))
            .flatMap { case (prev, last) => prev ++ last.map { case (index, testCases) => (index, testCases :+ testPair) } }
        })
      .map { case (_, testCases) => testCases.flatMap(testCase => testCase.split("\s").map(_.toInt)) }
      .map(testCases => (testCases.headOption ++ testCases.lastOption)) // need to convert to tuple
  }
}
