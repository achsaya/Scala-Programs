object Curring {
  def main(args: Array[String]): Unit = {
    println(add(10, 20))
    println(add2(10)(20))
  }

  def add(i: Int, i1: Int) = i + i1

  def add2(i: Int) = (i1:Int) => i+i1

}