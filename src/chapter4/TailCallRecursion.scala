import scala.annotation.tailrec

@tailrec
def fact(n: Int, acc: BigInt): BigInt = {
  if ((n == 0) || (n == 1)) acc
  else fact(n - 1, acc * n)
}

def factorial(n: Int):BigInt = fact(n,1)


println(factorial(5))
println(factorial(100))
println(factorial(1000))
println(factorial(10000))