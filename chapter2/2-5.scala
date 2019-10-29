// Implement the higher-order function that composes two functions.
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

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (A) => f(g(A))
  }

  def main(args: Array[String]): Unit = {
    val funcao1 = (a: Int) => a.toString()
    val funcao2 = (b: String) => b.toLong
    val intToLong = compose(funcao2, funcao1)
    println(intToLong(5))
    // val funcaozinha = (a: Int, b: Int) => a+b
    // val curried = curry(funcaozinha)
    // val uncurried = uncurry(curried)
    // println(uncurried(3,4))
  }

}

