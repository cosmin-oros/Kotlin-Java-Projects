package Codewars

fun duplicates(array: IntArray): Int {
    var registry: ArrayList<Int> = ArrayList(array.size)
    var duplicates: Int = 0
    for (item in array) {
        if (registry.contains(item)) {
            duplicates += 1
            registry.remove(item)
        } else {
            registry.add(item)
        }
    }
    return duplicates
}

fun main(){
    val arr = intArrayOf(1,2,5,6,5,2)
    println("The number of pairs: "+duplicates(arr))
}