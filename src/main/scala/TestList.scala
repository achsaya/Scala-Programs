object TestList {
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 2, 3, 4, 5, 6)
    val l2: List[String] = List("abc", "xyz") //to create empty list
    val l3 = Nil
    val l4 = List.empty

    println(l1)

    println(l2 ::: (3 :: Nil))
    val v3 = List.fill(7)(6)

    println(v3)
    println(v3.size)
    println(v3.length)
    println(l1.length)
    println(l1.apply(2))
    println(l1(1))

    for (i <- l1) {
      println(i)
    }
    println(l1.head)
    println(l1.tail)
    println(l1.contains(1))

    val filtered = l1.filter(x => x > 3)
    val filtered2 = l1.filter(_ > 3)
    println(filtered)
    val (even, odd) = l1.partition(_ % 2 == 0)
    var l9: List[Int] = l1.map((x) => {
      x * 2
    })
    var l10 = l1.flatMap(x => List(x, x + 1))
    print(l10)

    println(even)
    println(odd)
    l1.foreach(x => {
      println(x)
    })
    var l6 = l1.map(x => x + 200)
    println(l6)
  }
}
