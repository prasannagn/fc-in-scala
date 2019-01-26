package answer

object GettingStarted {

  // Exercise 1: Write a function to compute the nth fibonacci number

  // 0 and 1 are the first two numbers in the sequence,
  // so we start the accumulators with those.
  // At every iteration, we add the two numbers to get the next one.
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, curr: Int): Int = {
      if (n == 0)
        prev
      else
        loop(n - 1, curr, curr + prev)
    }

    loop(n, 0, 1)
  }

  //EXERCISE 2: Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function.

  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n:Int): Boolean ={
      if(n >= as.size -1) true
      else if (gt(as(n), as(n+1))) false
      else loop(n+1)
    }
    loop(0)
  }

  // Exercise 3: Implement `curry`.

  // Note that `=>` associates to the right, so we could
  // write the return type as `A => B => C`
  def curry[A,B,C](f: (A, B) => C): A => (B => C) ={
    a => b=> f(a,b)
  }

  // Exercise 4: Implement `uncurry`
  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

  // Exercise 5: Implement `compose`

  def compose[A,B,C](f: B => C, g: A => B): A => C =
    a => f(g(a))

  //  EXERCISE 6: Implement the higher-order function that composes two functions.
  def compose[A,B,C](f: B => C, g: A => B): A => C = a => f(g(a))
}
