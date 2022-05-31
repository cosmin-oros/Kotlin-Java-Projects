package Codewars

import org.junit.Assert.*
import org.junit.Test
import java.util.Random
import kotlin.math.*

class solvTest {
    private fun assertFuzzy(m:Double, expect:Double) {
        val merr = 1e-12
        println("Testing " + m)
        val actual = solve(m)
        println("Actual: " + actual)
        println("Expect: " + expect)
        val inrange = Math.abs(actual - expect) <= merr
        if (inrange == false)
        {
            println("Expected must be near " + expect + ", got " + actual)
        }
        println("-")
        assertEquals(true, inrange)
    }
    @Test
    fun test1() {
        assertFuzzy(2.00, 5.000000000000e-01)
        assertFuzzy(4.00, 6.096117967978e-01)
        assertFuzzy(5.00, 6.417424305044e-01)

    }
}

fun solve(m:Double):Double {
    val x1 = (2.0 * m + 1.0 + sqrt(4.0 * m + 1.0)) / (2.0 * m)
    val x2 = (2.0 * m + 1.0 - sqrt(4.0 * m + 1.0)) / (2.0 * m)
    val x = if ((x1 > 0) && (x1 < 1)) x1 else x2
    return x
}

fun main(){
    println(solve(4.00))
}