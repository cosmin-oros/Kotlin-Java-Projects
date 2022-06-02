package Codewars

import org.junit.Assert.*
import org.junit.Test

class BouncingBallTest {
    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }
    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }

}

fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1
    var bounceHeight = h * bounce
    var count = 1
    while (bounceHeight > window) {
        count += 2
        bounceHeight *= bounce
    }
    return count
}

fun main(){
    println(bouncingBall(30.0, 0.66, 1.5))
}