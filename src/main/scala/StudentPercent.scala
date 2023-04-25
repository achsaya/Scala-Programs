import scala.io.StdIn.{readInt, readLine}

object StudentPercent {
  def main(args: Array[String]): Unit = {

  var marks:Array[Int] = new Array[Int](5)
    println("Enter a name: ")
    var name= readLine()
    println("Enter 5 marks: ")
    marks(0) = readInt()
    marks(1) = readInt()
    marks(2) = readInt()
    marks(3) = readInt()
    marks(4) = readInt()
    var total = 0
    for(i<-marks){
      total = total + i
    }

    var percent = (total / 500f) * 100f
    println(s"Total: $total")
    println(s"Percentage of $name : $percent" )
  }
}
