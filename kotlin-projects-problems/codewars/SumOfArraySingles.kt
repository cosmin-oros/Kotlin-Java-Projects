package Codewars

import org.junit.Test
import kotlin.test.assertEquals

fun repeats(arr: IntArray): Int{
    var sum = 0
    arr.forEach { e ->
        val result = arr.filter { f -> f == e }
        if (result.size == 1) {
            sum += e
        }
    }

    return sum
}

class SolTest {
    @Test
    fun basicTests() {
        assertEquals(15, repeats(intArrayOf(4, 5, 7, 5, 4, 8)).toLong())
        assertEquals(19, repeats(intArrayOf(9, 10, 19, 13, 19, 13)).toLong())
        assertEquals(12, repeats(intArrayOf(16, 0, 11, 4, 8, 16, 0, 11)).toLong())
    }
}

fun main(){
    println(repeats(intArrayOf(4, 5, 7, 5, 4, 8)).toLong())
}