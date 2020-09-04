package easy.functionOrNot

class Solution {

  def solve(testCases: Seq[(Int, Int)]): String =
    testCases
      .groupBy { case (input, _) => input }
      .map { case (_, testCases) => testCases }
      .filter(testCases => testCases.length > 1) match {
      case failures if failures.nonEmpty => "NO"
      case _ => "YES"
    }

  def main(args: Array[String]): Unit =
    main(io.Source.stdin.getLines().toSeq.reduce(_ + "\n" + _))

  def main(arg: String): Seq[String] = {
    arg.split("\n").tail.toSeq
      .foldLeft(Seq.empty[(String, Seq[String])])((acc, element) =>
        element match {
          case newIndex if element.split("\\s+").length == 1 => acc ++ Seq((newIndex, Seq.empty[String]))
          case testPair => Seq(acc.splitAt(acc.length - 1)).flatMap { case (prev, last) => prev ++ last.map { case (index, testCases) => (index, testCases :+ testPair) } }
        })
      .map { case (_, testCases) => testCases }
      .map(testCases => testCases
        .map(testCase => testCase.split("\\s+").map(_.toInt))
        .map(testCases => (testCases.head, testCases.last)))
      .map(solve)
  }
}
