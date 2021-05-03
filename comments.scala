'''In Scala, there are three types of comments:

Single – line comments.
Multi – line comments.
Documentation comments.
'''


object MainObjectExample {
  def main(args: Array[String]): Unit = {
    println("This is a single line statement")
    // Single line comment

    println("Multi line comments ")
    /* Multi line
    comments
     */
    println("Document comments")

    """
    This is used for document comment.
       Which is used for multiple documentation purpose.
    """"

  }

}

