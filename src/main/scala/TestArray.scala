object TestArray {
  def main(args: Array[String]): Unit = {
    val myarr = Array.ofDim[Int] (2,2)
    var n:Int=1
    val myarr1 = Array(Array(1,2,3,4),Array(3,4,5,6),Array(7,8,9,10),Array(11,12,13,14))
    var n1:Int = 3
    myarr(0)(1) = 10
    myarr(0)(0) = 20

    /*println(myarr(0)(0))
    for(i<- 0 to n; j<-0 until n){
      print(i,j)
      println("=" + myarr(i)(j))
    }
    for (i<- 0 to n1){
      var j=0
      print(myarr1(j)(i)+" ,")
    }
    println()
    for (i <- 0 to n1) {
      var j = 1
      print(myarr1(j)(i) + " ,")
    }*/


    for (i <- 0 to n1){
      for(j<-0 to n1){
        print(myarr1(i)(j))
        if(j!=n1)
          print(" ,")
      }
      println()
    }

  }

}
