import scala.compiletime.ops.string
object Main {

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny") () (toUpper(_)))
        println(formatNames("Niroshan") (indexList=0,1) (toUpper(_)))
        println(formatNames("Saman") () (toLower(_)))
        println(formatNames("Kumara") (indexList=0,5) (toUpper(_)))
    }

    def toUpper ( name: String ) : String = {
        return name.toUpperCase()
    }

    def toLower ( name: String ) : String = {
        return name.toLowerCase()
    }

    def formatNames ( name: String ) ( indexList : Int* ) ( function : String=>String ) : String = {
        if ( indexList.isEmpty ){
            return function(name)
        } else {
            var tempName = ""
            var i=0
            while ( i < name.length() ){        //1-7                               //i=2
                if ( indexList.contains(i) ){                                       //indexList=0,1              
                    tempName = tempName + function(name.charAt(i).toString)         //tempName = tempName + toupper("i")            Niroshan->1
                } else {                                        
                    tempName = tempName + name.charAt(i).toString                   // tempName = tempName + "r"
                }
                i = i+1
            }
            return tempName
        }
    }

}