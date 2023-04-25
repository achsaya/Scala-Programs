object ArrayExample {
  def main(args: Array[String]): Unit = {

    var myarr:Array[String] = new Array[String](3)
    myarr(0) = "Hello"
    myarr(1) =  "one"
    myarr(2) = "two"

    println(myarr(2))

    for(i<-myarr){
      println(i)
    }

    var myarr1 = Array(1,3,4,5)
    println(myarr1(1))
  }

}
