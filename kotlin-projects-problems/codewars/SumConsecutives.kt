package Codewars

fun sumConsecutives(s: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    var prev: Int? = null
    s.forEach {
        if (it != prev) result.add(it)
        else result[result.lastIndex] += it
        prev = it
    }
    return result
}

fun main(){
    var list = arrayListOf<Int>(1,4,4,4,0,4,3,3,1)
    println(sumConsecutives(list).toString())
}