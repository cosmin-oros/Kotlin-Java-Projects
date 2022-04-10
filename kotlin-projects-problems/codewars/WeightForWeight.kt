package Codewars

import org.junit.Test
import kotlin.test.assertEquals

fun orderWeight(string:String):String {
    var s = string.split(" ").sorted().sortedBy { it.map { it.toString().toInt() }.sum() }.joinToString(" ")
    return s
}

class WeightSortTest {

    @Test
    fun BasicTests() {
        println("****** Basic Tests ******")
        assertEquals("2000 103 123 4444 99", orderWeight("103 123 4444 99 2000"))
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999",
                        orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"))

    }
}

fun main(){
    println(orderWeight("2000 103 123 4444 99"))
}