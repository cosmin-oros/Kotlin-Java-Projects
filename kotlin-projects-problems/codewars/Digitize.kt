package Codewars

fun digitize(n:Long):IntArray {
    val result = n.toString().map { it.toString().toInt() }.toIntArray();

    return result.reversedArray();
}

fun main(){
    println(digitize(348597).contentToString())
}