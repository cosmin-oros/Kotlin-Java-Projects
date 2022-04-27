package Codewars

import org.junit.Test
import kotlin.test.assertEquals

object PositionAverage {

    fun posAverage(s: String): Double {
        val list = s.split(", ")
        val size = list.size
        var sum = 0.0
        var signs = 0
        for (i in (0 until size - 1)) {
            for (j in i + 1 until size) {
                sum += list[i].mapIndexed { index, c ->
                    signs++
                    if (list[j][index] == c) 1 else 0
                }.sum()
            }
        }
        return sum * 100 / signs
    }
}

class PositionAverageTest {
    private fun assertFuzzy(s: String, exp: Double) {
        val inrange: Boolean
        val merr = 1e-9
        val actual = PositionAverage.posAverage(s)
        inrange = Math.abs(actual - exp) <= merr
        if (!inrange) {
            println("Expected mean must be near $exp, got $actual")
        }
        assertEquals(true, inrange)
    }
    @Test
    fun test() {
        assertFuzzy("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096", 26.6666666667)
        assertFuzzy("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490", 29.2592592593)
        assertFuzzy("449404, 099090, 600999, 694460, 996066, 906406, 644994, 699094, 064990, 696046", 24.4444444444)

    }
}

fun main(){
    println(PositionAverage.posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096"))
}