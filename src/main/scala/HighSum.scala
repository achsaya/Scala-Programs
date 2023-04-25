object HighSum {
  def sum(a:Int,b:Int,func:(Int)=> Int): Int ={
    func(a)+func(b)
  }

  def main(args: Array[String]): Unit = {
    var c = sum(10,20,square)
    println(s"Sum of squares : $c")
    var d = sum(10, 20, (cube:Int)=> cube*cube*cube)
    println(s"Sum of cubes : $d")

  }
  def square(a:Int): Int=(a*a)

  /*def cube(a: Int): Int = {
    return a * a * a
  }*/

}
