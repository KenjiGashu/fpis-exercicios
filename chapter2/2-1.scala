/*Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
 The first two Fibonacci numbers are 0 and 1 . The nth number is always the sum of the
 previous two—the sequence begins 0, 1, 1, 2, 3, 5 . Your definition should use a
 local tail-recursive function.*/
object chapter21{
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, ant: Int, i: Int, resp: Int): Int = {
      if(i > n) resp
      else if (i==1) loop(n, 1, i+1, resp+1)
      else if (i==0) loop(n, 0, i+1, resp)
      else loop(n, resp, i+1, resp+ant)
    }
    loop(n,0,0,0)
  }


  // def main(args: Array[String]): Unit = {
  //   println(fib(0))
  //   println(fib(1))
  //   println(fib(2))
  //   println(fib(3))
  //   println(fib(4))
  //   println(fib(5))
  //   println(fib(6))
  // }


}

