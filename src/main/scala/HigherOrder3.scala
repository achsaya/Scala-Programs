object HigherOrder3 {
  def mathOperation(name: String): (Int, Int)=> Int= {
    (x: Int, y: Int) =>{
      name match{
        case "addition" => x+y
        case "subtraction" => x-y
        case "multiplication" => x*y
        case "division" => x/y
      }
    }

  }

  def add: (Int, Int) => Int = mathOperation(name = "addition")

  def sub: (Int, Int) => Int = mathOperation(name = "subtraction")

  def mul: (Int, Int) => Int = mathOperation(name = "multiplication")

  def div: (Int, Int) => Int = mathOperation(name = "division")

  def main(args: Array[String]): Unit = {
    var v = add (34,56)
    println(v)
  }
}
