object Main {

    def main(args: Array[String]): Unit = {
        println("Input a positive number : ")
        var number = scala.io.StdIn.readInt()
        odd_even(number)
    }

    def odd_even ( num : Int ) = num match{
        case x if(x<=0) => println("Negative/Zero is input")
        case x if(x%2==0) => println("Even is given")
        case x if(x%2==1) => println("Odd is given")
    }
}