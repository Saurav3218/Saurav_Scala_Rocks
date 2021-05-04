object RangeExample {

  def main(args: Array[String]): Unit = {

    val s=Range(1,10,2);

    for (a <- s) {
      println(a)


    }

    println(" Next for loop will execute")

    val c= 5 until 13 by 2;
      for ( d<-c )
        println(d)


    // applying range method
    val x = Range(1, 8)

    // Including upper bound
    val y = x.inclusive

    // Displays all the elements
    // of the range
    println(y)
  }


}
