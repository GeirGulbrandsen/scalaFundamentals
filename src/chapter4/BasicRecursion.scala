def factorial(x:Int):BigInt = {
  if ((x == 0) || (x == 1)) 1
  else x * factorial(x - 1)
}

println(factorial(0))
println(factorial(1))
println(factorial(2))
println(factorial(12))