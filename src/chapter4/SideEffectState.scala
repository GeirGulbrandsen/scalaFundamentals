var a = 0

def sideEffect(): Unit = {
  a = a + 1
}

println(a)
println(sideEffect())
println(a)