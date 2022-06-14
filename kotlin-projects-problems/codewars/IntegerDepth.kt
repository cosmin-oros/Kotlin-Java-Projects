package Codewars

import org.junit.Test
import kotlin.test.assertEquals

class ExTest {
    fun runTest(n: Int, sol: Int) = assertEquals(sol,kata.computeDepth(n))

    @Test fun `Sample tests`() {
        runTest(1, 10)
        runTest(42, 9)
        runTest(25, 36)
    }
}

object kata {
    fun computeDepth(n: Int): Int {
        var depth = 0
        val nums: MutableSet<Char> = mutableSetOf()
        while (true) {
            depth += 1
            var prod = depth * n
            var chars = prod.toString()
            for (i in chars){
                nums.add(i)
            }
            if(nums.size == 10){
                break
            }
        }
        return depth
    }
}

fun main(){
    println(kata.computeDepth(1))
}