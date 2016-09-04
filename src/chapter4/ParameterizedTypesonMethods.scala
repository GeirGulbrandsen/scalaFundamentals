def decide[T](b:Boolean, x:T, y:T):T = if (b) x else y

println(decide(true, "A", "B"))
println(decide(false, 5, 10))
println(decide(true, 'c', 'd'))


def returnNextChar(c:Char) = (c + 1).toChar

println(returnNextChar(decide(true, 'c', 'd')))
