import scala.io.StdIn.readInt

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    var result = sum(10,23)
    println(result)
    println("Enter a number for factorial: ")
    var a = readInt()
    var res = findFactorial(a)
    println("Factorial of "+a+" is "+res)
  }
  def sum(a:Int,b:Int):Int={
    var sum = a+b
    return sum
  }
 /* def findFactorial(v:Int): Int = {
    var fact = 1
    for (i <-v to 1 by -1) {
      fact = fact * i
    }
    return fact
  }*/

  /*def findFactorial(v: Int): Int = {
    if(v<=1){
      return 1;
    }else{
      return v*findFactorial(v-1)
    }
  }*/
  def findFactorial(v:Int): Int ={
    if(v<=1) 1 else v * findFactorial(v-1)
  }
}
