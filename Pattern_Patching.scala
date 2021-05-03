
'''
Pattern matching is a way of checking the given sequence of tokens for the presence of the specific pattern. It is the most widely used feature in Scala. 
'''


object PatternMatching {

  // main method
    def main(args: Array[String]) {

      // calling test method
      println(test(5));
      println(test(1));
      
    }


    // method containing match keyword
    def test(x:Int): String = x match {

      // if value of x is 0,
      // this case will be executed
      case 0 => "Hello, Geeks!!"

      // if value of x is 1,
      // this case will be executed
      case 1 => "Are you learning Scala?"

      // if x doesnt match any sequence,
      // then this case will be executed
      case _ => "Good Luck!!"
    }


}
