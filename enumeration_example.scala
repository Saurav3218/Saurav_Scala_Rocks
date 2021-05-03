"""
An enumerations serve the purpose of representing a group of named constants in a programming language
"""

// Scala program Printing default ID of 
// any element in the enumeration
  
// Creating Enumeration
object Main extends Enumeration 
{
    type Main = Value
   
    // Assigning Values
    val first = Value("Thriller") // ID = 0
    val second = Value("Horror") // ID = 1
    val third = Value("Comedy") // ID = 2
    val fourth = Value("Romance") // ID = 3
       
    // Main Method 
    def main(args: Array[String]) 
    {
        println(s"ID of third = ${Main.third.id}")
    }
}

"""
// Scala program of Matching values in enumeration
  
// Creating Enumeration
object Main extends Enumeration 
{
    type Main = Value
      
    // Assigning Values
    val first = Value("Thriller")
    val second = Value("Horror")
    val third = Value("Comedy")
    val fourth = Value("Romance")
      
    // Main Method 
    def main(args: Array[String]) 
    {
        Main.values.foreach
        {
            // Matching values in Enumeration
            case d if ( d == Main.third ) => 
            println(s"Favourite type of Movie = $d")
            case _ => None
        } 
    }
}
"""
