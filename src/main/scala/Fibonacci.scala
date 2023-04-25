import scala.io.StdIn.readInt

object Fibonacci {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")

    var v = readInt()
    for (i<-1 to v) {
        print(fiboSeries(i) + ", ")
      }
    print("..")
  }
  def fiboSeries(a:Int): Int = {
    if (a < 3) 1
    else fiboSeries(a - 1) + fiboSeries(a - 2)
  }

}
