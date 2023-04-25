import scala.io.StdIn.readInt

object DoWhileDemo {
  def main(args: Array[String]): Unit = {
    var i = 10;
    do {
      println("Please enter your input")
      println("1.Add 2.Sub 3.Multiply 4.Divide")
      var choice = readInt()
      println("Enter value: ")
      var a = readInt()
      println("Enter value: ")
      var b = readInt()
      choice match {
        case 1 => println(a + b)
        case 2 => println(a - b)
        case 3 => println(a * b)
        case 4 => println(a / b)
        case 5 => println("default")
      }
    } while (true)
  }
}
