package easy.fibonacci

class Solution {

  def fibonacci(x: Int): Int =
    calcNextFibonacci(0, 1, x)

  def calcNextFibonacci(minusOne: Int, current: Int, count: Int): Int =
    count match {
      case activeCount if activeCount > 2 => calcNextFibonacci(current, minusOne + current, count - 1)
      case _ => current
    }

}
