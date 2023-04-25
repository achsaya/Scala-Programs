object StringInterpolation {
  def main(args: Array[String]): Unit = {
    var x =100
    println(s"the value of x is $x")

    var k = s"this is the value $x"
    println(k)

    var l=2.2
    println(f"this is string $l%2.20f $k%s")

    println(raw"the value \n of x is $x")

    println(s"the value$$ of x is $x ")
  }

}
