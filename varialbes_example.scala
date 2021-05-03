"""
Variable declaration specifies the name of the variable that would be stored in the memory and memory can be accessed further with this name of variable. 
There are three types of scope for Scala variable.

Fields.
Method Parameters.
Local Variables.
"""

// Scala program of field 
// scope for Scala variable
  
// class created with field 
// variables x and y.
class S1 
{
    var x = 10.3f
    var y = 7f
    def windet() 
    {
        println("Value of x : "+x)
    }
        println("Value of y : "+y);
}
  
object Example 
{
    // Main method
    def main(args:Array[String]) 
    {
        val Example = new S1()
        Example.windet()
    }
}

"""
We use these variables when we want to pass a value inside the method when we call it. 
They can be accessed inside the method and outside method if there is a reference to the object from outside the method. 
these variables are always mutable Using with ‘val’ keyword.

Example:


// Scala program of Method 
// scope for Scala variable
  
// class created with Method 
// variables s1 and s2.
class rect 
{
    def mult(s1: Int, s2: Int)
    {
        var result = s1 * s2
       println("Area is: " + result);
    }
}
  
object Area 
{
    // Main method
    def main(args:Array[String])
    {
        val su = new rect()
        su.mult(5, 10)
    }
}

"""

"""
Local Variables

These type of variables are declared inside a method and are accessible within it only.Using ‘var’ & ‘val’ keywords, these variables can be both mutable & immutable.
Example:


// Scala program of Method 
// scope for Scala variable
  
// class created with Local
// variables s1 and s2.
class Area 
{
    def mult() 
    {
        var(s1, s2) = (3, 80);
        var s = s1 * s2;
        println("Area is: " + s)
    }
}
  
object Test 
{
    // Main method
    def main(args:Array[String]) 
    {
        val ex = new Area()
        ex.mult()
    }
}
"""
