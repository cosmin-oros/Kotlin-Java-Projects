package Codewars

fun numberOfPairs(gloves:List<String>) : Int {
    var list1 = mutableListOf<Int>()
    val x = gloves.groupingBy { it }.eachCount()
    for ((key, value) in x) {
        list1.add(value/2)
    }
    return list1.sum()
}

fun main(){
    val l = listOf("red","green","red","blue","green")
    println("Number of pairs: "+ numberOfPairs(l))
}