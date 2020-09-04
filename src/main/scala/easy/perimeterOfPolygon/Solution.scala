package easy.perimeterOfPolygon

class Solution {

  def main(args: Array[String]): Unit =
    println(main(io.Source.stdin.getLines().toSeq.reduce(_ + "\n" + _)))

  def main(input: String): Double = {
    val perimiter = solve(
      input.split("\\n").tail
        .map(pointString => pointString.split("\\s+").map(_.toInt))
        .map(points => (points.head, points.last))
    )

    BigDecimal(perimiter).setScale(8, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def solve(points: Seq[(Int, Int)]): Double =
    points.zip(points.tail :+ points.head)
      .map { case ((fromX, fromY), (toX, toY)) => scala.math.sqrt(scala.math.pow(fromX - toX, 2) + scala.math.pow(fromY - toY, 2)) }
      .sum

}
