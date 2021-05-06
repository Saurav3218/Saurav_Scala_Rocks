"""
A do..while loop is used when we want the loop to run at least one time. 
It is also known as the exit controlled loop as the condition is checked after executing the loop.
"""

object Demo2 {
  def main(args: Array[String]): Unit = {


    var c:Int=12;

    // Using do .. while loop

    do {
      print("Entering to the do block !!! ")
      println(c)
      c-=1;

    }while(c > 0);

  }

}
