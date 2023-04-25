object TestMap {
  def main(args: Array[String]): Unit = {
    val mymap = Map(1->"test","sss"->"sss")

    println(mymap)
    println(mymap(1))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)
    for (i<-mymap.keys){
      println(s"$i==>${mymap(i)}")
    }
  }

}
