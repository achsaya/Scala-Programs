import scala.io.StdIn.readLine

object AnnoymusFunction {
  def main(args: Array[String]): Unit = {
    /*val p = (i:Int)=>{
      println("Hi")
      i
    }*/
    val s1 = (i:String)=>{
      i
    }
    val s2 = (i: String) => {
      i
    }
    //println(p(456))
    /*println("Enter a string: ")
    var a = readLine()
    println("Enter a string: ")
    var b = readLine()
    println(s1(a)+s2(b))*/

    val v = (_: String)+(_: String)
    println(v("Hello","Everyone"))

    val vi = (_: Int)+(_: Int)
    println(vi(23,45))
  }

}
