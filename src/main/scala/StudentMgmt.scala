import scala.io.StdIn.{readInt, readLine}

object StudentMgmt {
  var students:Array[String] = new Array[String](10)
  var i = 0
  def addstudent(): Unit = {
    println("Please enter the name")
    var sname = readLine()
    students(i) = sname
    i = i+1
  }
  def liststudent(): Unit = {
    println("Student Name")
    println("------------")
    for(k<-0 to i-1){
      println(students(k))
    }
  }

  def main(args: Array[String]): Unit = {
    while(true){
      println("Please choose operation: ")
      println("1.Add student\t 2.List students")
      var ch = readInt()
      ch match{
        case 1=> addstudent()
        case 2=> liststudent()
        case _=> println("Invalid operation")
      }
    }
  }

}
