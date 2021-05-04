object Test {

  def main(args: Array[String]): Unit = {

    // Declaring a variable

    /*
    var a:Int=3;
    if (a > 35){
      println("A is greater than given number")
    }
    else
      println("A is not greater than the given number")


     */

    /*var a: Int = 50
    var b: Int = 120
    var c: Int = 20;

     */

    def greatestNumber(a: Int, b: Int, c: Int) = {

      // condition 1

      if (a > b) {
        // Condition 2
        if (a > c) {

          println("A is the largest number")
        }

      }

      else if (c > a && c > b) {

        println(s"C is the actual largest number : $c")
      }

      else {
        println(s"B is the largest number : $b")
      }

    }

    greatestNumber(69, 345, 256)
  }

}
