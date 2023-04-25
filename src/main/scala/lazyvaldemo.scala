object lazyvaldemo extends App{
  lazy val b={
    println("this is code block")
    val x = 10
    val y=12
    x+y
  }

  val a=b+1
  val a1=b+1
  val a2=b+1
  val a3=b+1

  sayHello()
  sayHello()
  sayHello()
  sayHello()

  def sayHello(): Unit={
    println("Hello")
  }

}
