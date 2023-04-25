object HigherFunction {
  def myCal(a:Int,b:Int,func:(Int,Int)=>Int): Int = {
    var x = func(a,b)
    a+b*x
  }

  def main(args: Array[String]): Unit = {
    var c = myCal(1,2,add)
    println(c)
  }
  def add(a:Int,b:Int): Int={
    return (a+a)*(b+b)

  }

}
