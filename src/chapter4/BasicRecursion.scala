def factorial(x:Int):BigInt = {
  if ((x == 0) || (x == 1)) 1
  else x * factorial(x - 1)
}

println(factorial(5))
println(factorial(100))
println(factorial(100))
println(factorial(1000))