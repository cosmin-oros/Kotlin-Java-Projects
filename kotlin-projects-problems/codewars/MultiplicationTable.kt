package Codewars

object multipTable {
    fun multiplicationTable(size: Int): Array<IntArray> {
        return Array(size){i ->
            IntArray(size){(it + 1) * (i + 1)}
        }
    }
}

fun main(){
    val size = 4
    val dArr = multipTable.multiplicationTable(size)
    for (i in 0 until size){
        for (j in 0 until size){
            print(" "+dArr[i][j])
        }
        println()
    }
}