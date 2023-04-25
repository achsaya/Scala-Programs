object ForDemo {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 10){
      println(i)
    }
    for(j<- 2 until 20){
      println("Hi " + j)
    }
    for (i<-1 to 10 if(i%2 == 0)){
      println("Hello "+i)
    }
    for (i<-1 to 30 by 2){
      println(i)
    }
    for (i<-50 to 1 by -5){
      println(i)
    }
    for(i<-1 to 100 by 2 if(i%2 == 0)) {
      println(i)
    }

  }

}
