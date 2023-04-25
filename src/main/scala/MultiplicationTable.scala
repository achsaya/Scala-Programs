import scala.io.StdIn.readInt

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    print("Enter a number to print multiplication table : ")
    var a = readInt()

    for (i <- 1 to 10 if (i != 5) ) {

        println(i + " * " + a + " = " + (a * i))

    }
  }
}
