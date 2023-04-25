object HigherOrder2 {
  def myFunc():(String,String) =>String ={
    return myFunc2
  }
  def myFunc2(a: String,b: String): String ={
    return a.toUpperCase()+b.toUpperCase()
  }

  def main(args: Array[String]): Unit = {
    var v= myFunc()
    println(v("Hello","everyone"))
  }

}
