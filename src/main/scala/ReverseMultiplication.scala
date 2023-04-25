import scala.io.StdIn.readInt

object ReverseMultiplication {
  def main(args: Array[String]): Unit = {
    print("Enter a number to print multiplication table : ")
    var a = readInt()

    for (i <- 10 to 1  by -1 if (i != 7)) {

      println(i + " * " + a + " = " + (a * i))

    }
  }

}
