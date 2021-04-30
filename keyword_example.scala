// Here object, def, and var are valid keywords

object Keyword_Example {
  def main(args: Array[String]): Unit = {

    var p=10;
    var q=50;
    var sum=p+q;
    println("The sum is : "+ sum)
  }

}


-------------------
// Here class keyword is used to create a new class
// def keyword is used to create Function
// var keyword is used to create a variable 
class Student {

  var name:String="Saurav";
  var age:Int=25;
  var branch:String="Electronics"

  def show(): Unit ={
    println("Hello! my name is "+ name + " and my age is" + age );
    println("My branch is : "+ branch)

  }
}

object Main{
  def main(args: Array[String]): Unit = {
    var s1=new Student();
    s1.show();

  }
}
