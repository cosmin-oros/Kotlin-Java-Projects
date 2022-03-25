package Codewars

fun sumParts(ls: IntArray): IntArray {
    val sum = IntArray(ls.size + 1)
    sum[0] = ls.sum()

    for (i in ls.indices) {
        sum[i+1] = (sum[i] - ls[i])
    }
    return sum
}

fun main(){
    var arr:IntArray = intArrayOf(0,1,3,6,10)
    println(sumParts(arr).toList())
}