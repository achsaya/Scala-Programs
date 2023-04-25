object pureFunction {
  var k=10

  def main(args: Array[String]): Unit = {
    println(sum(10,50))
  }

  def sum1(i:Int,j:Int):Int ={
    i+j
  }

  def sum(i:Int,j:Int):Int ={
    i+j*k
  }

}
