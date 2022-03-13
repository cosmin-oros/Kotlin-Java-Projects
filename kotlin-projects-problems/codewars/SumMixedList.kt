package Codewars

public fun sum(mixed: List<Any>): Int {
    var answer: Int = 0
    for (i in mixed) {
        answer += i.toString().toInt()
    }
    return answer
}
fun main(){
    val list = listOf<Any>(1,2,3)
    val sum = sum(list)
    println(sum)
}