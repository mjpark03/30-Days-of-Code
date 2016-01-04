import scala.io.StdIn.readLine

object Day2 {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val m: Double = readLine().toDouble;
    val t: Integer = readLine().toInt;
    val x: Integer = readLine().toInt;

    val tip: Double = calculateTip(m, t.toDouble);
    val tax: Double = calculateTax(m, x.toDouble);
    val price = Math.round(m + tip + tax);

    println("The final price of the meal is $" + price + ".");
  }

  def calculateTip(m: Double, t: Double): Double = {
    return (m*t)/100.0;
  }

  def calculateTax(m: Double, x: Double): Double = {
    return (m*x)/100.0;
  }

}
