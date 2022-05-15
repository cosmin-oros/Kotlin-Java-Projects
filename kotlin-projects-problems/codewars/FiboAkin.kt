package Codewars

import org.junit.Assert.*
import org.junit.Test

class fibkindMainTest {
    private fun dotest1(n:Int, k:Int, expected:Long) {
        assertEquals(expected, lengthSupUK(n, k))
    }
    private fun dotest2(n:Int, expected:Long) {
        assertEquals(expected, comp(n))
    }
    @Test
    fun test1() {
        println("Basic Tests lengthSupUK")
        dotest1(50, 25, 2)
        dotest1(3332, 973, 1391)

    }
    @Test
    fun test2() {
        println("Basic Tests comp")
        dotest2(74626, 37128)
        dotest2(71749, 35692)

    }
}

fun getArr(n: Int): IntArray{
    val result = mutableListOf<Int>()
    result.add(1)
    result.add(1)
    for (i in 2 until n){
        result.add(result[i - result[i - 1]] + result[i - result[i - 2]])
    }
    return result.toIntArray()
}
fun lengthSupUK(n:Int, k:Int):Long {
    var count: Long = 0
    for (element in getArr(n)){
        if (element >= k) count++
    }
    return count
}
fun comp(n:Int):Long {
    var count: Long = 0
    val arr = getArr(n)
    for (i in 1 until arr.size){
        if (arr[i] < arr[i - 1]) count++
    }
    return count
}

fun main(){
    println(lengthSupUK(50, 25))
    println(comp(74626))
}
