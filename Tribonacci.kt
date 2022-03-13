package Codewars

fun tribonacci(signature: Array<Double>, n:Int)= DoubleArray(n).also {
    for (i in 0 until n) {
        it[i] = if (i < signature.size) signature[i] else it[i - 3] + it[i - 2] + it[i - 1]
    }
}
fun main(){
    val sig = arrayOf(1.0,2.1,2.2)
    val n = 5
    println(tribonacci(sig,n).contentToString())
}