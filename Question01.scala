object Main {

    def main(args: Array[String]): Unit = {
        val deposit_amount = 25000000;
        val interest = calculate_interest(deposit_amount)
        println( interest )
    }

    def calculate_interest( deposit_amount:Double ) : Double = deposit_amount match {
            case x if x<=20000 =>  deposit_amount * 0.02
            case x if x<=200000 =>  deposit_amount * 0.04
            case x if x<=2000000 =>  deposit_amount * 0.035
            case x if x>2000000 =>  deposit_amount * 0.065
        }

}
