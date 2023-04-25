object PartialFunction {
  def main(args: Array[String]): Unit = {
    val abill=getBill(20,100,400)
    println(abill)

    val actbill=calculateBill(400)
    println(s"===>$actbill")
  }//fixed parameter

    def calculateBill : Double => Double= getBill(20,100,_:Double)

    def getBill(vatPercentage: Int,serviceTax: Int,netBill: Double): Double = {
    netBill * (vatPercentage / 100.0) + serviceTax+netBill;
  }
}
