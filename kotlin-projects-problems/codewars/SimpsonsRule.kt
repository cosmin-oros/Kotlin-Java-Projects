package Codewars

private fun f(x:Double):Double {
    return 1.5 * Math.pow(Math.sin(x), 3.0)
}
fun simpson(n:Int):Double {
    val h = Math.PI / n
    var s1 = 0.0
    for (i in 1..(n / 2).toInt())
    {
        s1 += f((2 * i - 1) * h)
    }
    var s2 = 0.0
    for (i in 1..(n / 2).toInt() - 1)
    {
        s2 += f(2.0 * i.toDouble() * h)
    }
    return Math.PI / (3 * n) * (f(0.0) + f(Math.PI) + 4 * s1 + 2 * s2)
}

fun main(){
    println(simpson(72))
}