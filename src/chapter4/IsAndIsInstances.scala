

val g:Any = "Ice, ice, Call me Maybe"
val h:String = g.asInstanceOf[String]

def decide(x:Any) = if (x.isInstanceOf[Int]) x.asInstanceOf[Int] + 1 else -1

println(decide("test"))
println(decide(10))
