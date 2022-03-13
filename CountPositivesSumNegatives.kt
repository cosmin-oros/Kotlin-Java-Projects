package Codewars

import java.util.*

fun countPositivesSumNegatives(input:Array<Int>?):Array<Int> {
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.count(), negative.sum())
}
fun main(){
    val input : Array<Int> = arrayOf(1,2,3,-13,4,-32)
    val arr : Array<Int> = countPositivesSumNegatives(input)
    println(Arrays.toString(arr))

}