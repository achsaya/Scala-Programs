import scala.io.StdIn.readInt

object OddNumber {
  def main(args: Array[String]): Unit = {
    print("Enter start value: ")
    var a = readInt()
    print("Enter end value: ")
    var b = readInt()

    for (i<-a to b if (i%2!=0))
      if(i%7!=0){
        print(" "+i)
      }
  }

}
