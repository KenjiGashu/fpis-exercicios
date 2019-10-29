/*Let’s look at another example, currying, 9 which converts a function f of two arguments
 into a function of one argument that partially applies f . Here again there’s only one
 implementation that compiles. Write this implementation.
 */
object chapter2{

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    A => (B => f(A,B))
  }

  def main(args: Array[String]): Unit = {
    println(curry((a: Int,b: Int) => a+b))
    val novafunc = curry((a: Int,b: Int) => a+b)
    val func2 = novafunc(3)
    println(novafunc(2))
    println(func2(5))
    // println(fib(0))
    // println(fib(1))
    // println(fib(2))
    // println(fib(3))
    // println(fib(4))
    // println(fib(5))
    // println(fib(6))
  }


}
