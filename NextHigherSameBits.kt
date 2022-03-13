package Codewars

fun nextHigherSameBits(n:Int):Int {
    val countUnos = Integer.toBinaryString(n).count { it == '1' }
    var curNum = n
    while (Integer.toBinaryString(++curNum).count { it == '1' } != countUnos) {}
    return curNum
}
fun main(){
    println(nextHigherSameBits(129))
}