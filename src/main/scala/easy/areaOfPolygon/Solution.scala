package easy.areaOfPolygon

class Solution {

  def main(args: Array[String]) {
    println(main(io.Source.stdin.getLines().toSeq.reduce(_ + "\n" + _)))
  }

  def main(input: String): Double =
    solve(
      input.split("\\n").tail
        .map(point => point.split("\\s+").map(_.toInt))
        .map(points => (points.head, points.last))
    )


  def solve(points: Seq[(Int, Int)]): Double =
    scala.math.abs(
      points.zip(points.tail :+ points.head)
        .map { case ((fromX, fromY), (toX, toY)) => fromX * toY - fromY * toX }
        .sum / 2.0
    )

}
