package Codewars

fun invertValues(arr: IntArray): IntArray {
    return arr.map { -it }.toIntArray()
}

fun main(){
    var array : IntArray = intArrayOf(1,2,3,-4)
    array = invertValues(array)
    println(array.contentToString())
}