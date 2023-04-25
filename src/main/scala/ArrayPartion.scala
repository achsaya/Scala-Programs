object ArrayPartion {
  /*def main(args: Array[String]): Unit = {
    var myarr = Array(1,2,3,4,5,6,7,8,9)
    var myarr2 = myarr.map((x)=>{
      x*2
    })
    var myarr3 = myarr.map(_*2)
    myarr2.foreach(println(_)+",")
    println("\n")
    myarr3.foreach(println(_))

  }*/

  def main(args: Array[String]): Unit = {
    val myarr=Array(1,2,3,4,5,6,7,8,9)
    var (even,odd)=myarr.partition((p)=>{
      if(p%2==0){
        return true
      }else{
        return false
      }
    })
    val (even1,odd1) = myarr.partition(_%2==0)
    even1.foreach(println(_))
    odd1.foreach(println(_))
  }

}
