import scala.io.StdIn.readInt

object Factorial {
  def main(args: Array[String]): Unit = {
    println("Enter a number for factorial: ")
    var a = readInt()
    var fact = 1
    for (i<-fact to a){
      fact = fact * i
    }
    println("Factorial of "+a+" is "+fact)
  }

}
