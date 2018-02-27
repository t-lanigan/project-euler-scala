// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
// The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.


object Mult35 {
  def main(args: Array[String]): Unit = {
    println((0 to 1000).filter((a) => (a % 3 == 0 || a % 5 == 0)).sum)
  }
}