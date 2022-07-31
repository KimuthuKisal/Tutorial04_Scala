import scala.compiletime.ops.string
object Main {

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny") () (toUpper(_)) (toLower(_)))
        println(formatNames("Niroshan") (indexList=0,1) (toUpper(_)) (toLower(_)))
        println(formatNames("Saman") () (toLower(_)) (toUpper(_)))
        println(formatNames("Kumara") (indexList=0,5) (toUpper(_)) (toLower(_)))
    }

    def toUpper ( name: String ) : String = {
        return name.toUpperCase()
    }

    def toLower ( name: String ) : String = {
        return name.toLowerCase()
    }

    def formatNames ( name: String ) ( indexList : Int* ) ( function1 : String=>String ) ( function2 : String=>String ) : String = {
        if ( indexList.isEmpty ){
            return function1(name)
        } else {
            var tempName = ""
            var i=0
            while ( i < name.length() ){        
                if ( indexList.contains(i) ){                                            
                    tempName = tempName + function1(name.charAt(i).toString)         
                } else {                                        
                    tempName = tempName + function2(name.charAt(i).toString)               
                }
                i = i+1
            }
            return tempName
        }
    }

}