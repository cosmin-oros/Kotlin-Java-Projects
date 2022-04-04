package Codewars

fun getSolution(arr: IntArray, sum: Int): Boolean {
    val operatorList = IntArray(arr.size) { 1 }
    return find(1, sum, arr, operatorList)
}

fun find(index: Int, sum: Int, arr: IntArray, operatorList: IntArray): Boolean {
    if (index < arr.size) {
        var x = find(index + 1, sum, arr, operatorList)
        if (x) return true

        operatorList[index] = -1
        x = find(index + 1, sum, arr, operatorList)
        if (x) return true

        operatorList[index] = 1
        return false
    }
    return getSum(arr, operatorList) == sum
}

fun getSum(arr: IntArray, operatorList: IntArray) =
    arr.indices.fold(0) { acc, index -> acc + (arr[index] * operatorList[index]) }

fun main(){
    println(getSolution(intArrayOf(1,3,4,6,8),-2))
}