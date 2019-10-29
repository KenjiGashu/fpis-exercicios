// Implement uncurry , which reverses the transformation of curry . Note that since =>
// associates to the right, A => (B => C) can be written as A => B => C .
object chapter2{

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    A => (B => f(A,B))
  }

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (A,B) => {
      val temp = f(A)
      temp(B)
    }
  }

  def main(args: Array[String]): Unit = {
    val funcaozinha = (a: Int, b: Int) => a+b
    val curried = curry(funcaozinha)
    val uncurried = uncurry(curried)
    println(uncurried(3,4))
  }

}
