object ArrayTest {
  def main(args: Array[String]): Unit = {
    var myarr = Array(1,2,3,4,5,6,7,8,9)
    myarr.foreach(printthis)
    myarr.foreach(n=> print(n))
    myarr.foreach(print(_))

  }
  def printthis (arr: Int): Unit = {
    if (arr == 5)
      println("Five")
    else
      println(arr)
  }

}
