
def processNumbers(b:Boolean = true, x:Int, y:Int) = if (b) x else y

println(processNumbers(y = 20, x = 10, b = true))

def add(x:Int, y:Int = 10) = x + y
println(add(5, 6))
println(add(5))

println(processNumbers(x = 5, y = 6))