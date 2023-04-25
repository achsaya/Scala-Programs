object StringComparison {
  def main(args: Array[String]): Unit = {
    val a = "Hello"
    val b = "Hello"
    println(s"a = $a, b = $b")
    if(a==b){
      println("a is equal to b")
    }
    else{
      println("a is not equal to b")
    }


    if (a eq  b) {
      println("a is equal to b")
    }
    else {
      println("a is not equal to b")
    }

    if (a.equals(b)) {
      println("a is equal to b")
    } else {
      println("a is not equal to b")
    }

    val k = "Hi"
    val l = "hi"
    println(s"k = $k, l = $l")
    if (k == l) {
      println("k is equal to l")
    } else {
      println("k is not equal to l")
    }

    if (k eq l) {
      println("k is equal to l")
    } else {
      println("k is not equal to l")
    }

    if (k.toUpperCase() == l.toUpperCase()) {
      println("k is equal to l")
    } else {
      println("k is not equal to l")
    }

    if (k.toLowerCase() == l.toLowerCase()) {
      println("k is equal to l")
    } else {
      println("k is not equal to l")

      if(k.equalsIgnoreCase(l)){
      println("k is equal to l")}
    }

  }

}
