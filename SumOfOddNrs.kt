package Codewars

fun sumOfOddNrs(n:Int):Int {
    val firstOddNumberOfRow = (0 until n).sum() + 1
    return (firstOddNumberOfRow until  firstOddNumberOfRow + n).map { 2 * it - 1 }.sum()
}
fun main(){
    println(sumOfOddNrs(2))
}