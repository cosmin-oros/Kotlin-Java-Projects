package Codewars

import org.junit.Assert.*
import org.junit.Test
import java.util.Random
import kotlin.math.log
import kotlin.math.hypot
import kotlin.math.sqrt

class solTest {
    private fun dotest(x:Double, y: Double, eps: Double, expect: Int) {
        val merr = 1.0
        println("Testing " + x + " " + y + " " + eps)
        val actual = f(x, y, eps)
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
        dotest(0.64, 0.75, 1e-12, 1952)
        dotest(0.3, 0.5, 1e-4, 17)
        dotest(30.0, 50.0, 1e-4, -1)

    }
}

fun f(x: Double, y: Double, eps: Double): Int = with(modulus(x, y)) {
    return if (this >= 1.0)
        -1
    else
        (log(eps, 10.0) / log(this, 10.0)).toInt()
}

fun modulus(x: Double, y: Double) = if (x == 0.0 || y == 0.0) 0.0 else sqrt(x * x + y * y)

fun main(){
    println(f(0.64, 0.75, 1e-12))
    println(f(0.3, 0.5, 1e-4))
}