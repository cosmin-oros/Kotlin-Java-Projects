package Codewars

import org.junit.Assert.*
import java.util.Arrays
import org.junit.Test

fun makeValley(arr:IntArray):IntArray {
    var L = mutableListOf<Int>()
    var R = mutableListOf<Int>()
    var side = false
    arr.sortedDescending().forEach {
        if (side) R.add(it) else L.add(it)
        side = !side
    }
    val valley = L + R.reversed()
    return valley.toIntArray()
}

class ValleyTest {
    //.................
    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }
    @Test
    fun test1() {
        println("Fixed Tests makeValley")
        var a = intArrayOf(17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1)
        var r = intArrayOf(17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17)
        testing(Arrays.toString(makeValley(a)), Arrays.toString(r))
        a = intArrayOf(20, 7, 6, 2)
        r = intArrayOf(20, 6, 2, 7)
        testing(Arrays.toString(makeValley(a)), Arrays.toString(r))

    }
}

fun main(){
    println(makeValley(intArrayOf(17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1)).toList())
}