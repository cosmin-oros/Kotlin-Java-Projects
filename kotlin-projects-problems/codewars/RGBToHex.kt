package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class TestExamplE {
    @Test
    fun testFixed() {
        assertEquals("000000", rgb(0, 0, 0))
        assertEquals("000000", rgb(0, 0, -20))
        assertEquals("FFFFFF", rgb(300,255,255))
        assertEquals("ADFF2F", rgb(173,255,47))
        assertEquals("9400D3", rgb(148, 0, 211))
    }
}

fun rgb(r: Int, g: Int, b: Int): String {
    return listOf(r, g, b)
        .map { v -> if (v > 255) 255 else v }
        .map { v -> if (v < 0) 0 else v }
        .map(Integer::toHexString)
        .map { v -> if (v.length == 1) "0$v" else v }
        .joinToString("")
        .uppercase()
}

fun main(){
    println(rgb(300,255,255))
}