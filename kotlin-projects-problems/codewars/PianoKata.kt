package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class Testt {
    @Test
    fun exampleTests() {
        assertEquals("white", blackOrWhiteKey(1))
        assertEquals("black", blackOrWhiteKey(5))
        assertEquals("black", blackOrWhiteKey(12))
        assertEquals("white", blackOrWhiteKey(42))
        assertEquals("white", blackOrWhiteKey(88))
        assertEquals("white", blackOrWhiteKey(89))
        assertEquals("white", blackOrWhiteKey(92))
        assertEquals("black", blackOrWhiteKey(100))
        assertEquals("white", blackOrWhiteKey(111))
        assertEquals("black", blackOrWhiteKey(200))
        assertEquals("white", blackOrWhiteKey(2017))
    }
}

val whiteList = listOf(0, 2, 4, 5, 7, 9, 11)

fun blackOrWhiteKey(keyPressCount: Int): String {
    var key = ((keyPressCount - 1) % 88)
    return if (key < 3) {
        if (key == 0 || key == 2) "white" else "black"
    } else {
        key = (key - 3) % 12
        if (whiteList.contains(key)) "white" else "black"
    }
}

fun main(){
    println(blackOrWhiteKey(1))
    println(blackOrWhiteKey(5))
    println(blackOrWhiteKey(2017))
}