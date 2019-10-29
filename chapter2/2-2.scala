/*Implement isSorted , which checks whether an Array[A] is sorted according to a
 given comparison function:
 def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean*/
object chapter22{
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if(n>=as.length)true
      else if(ordered(as(n-1), as(n))) loop(n+1)
      else false
    }

    loop(1)
  }

  def isOrdered(a: Int, b: Int): Boolean = {
    if(a <= b) true
    else false
  }
  
  def main(args: Array[String]): Unit = {
    val array1 = Array(1,2,3,5)
    val array2 = Array(1,3,2,4)
    println(array1.length)
    //sadly '>' and '<' are not functions like lisp
    // isSorted(array1, <) 
    // isSorted(array2, <)

    println(isSorted(array1, isOrdered))
    println(isSorted(array2, isOrdered))
  }


}
