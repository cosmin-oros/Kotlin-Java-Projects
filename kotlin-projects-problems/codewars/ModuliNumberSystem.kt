package Codewars

import org.junit.Test
import kotlin.test.assertEquals

object ModSystem {
    fun fromNb2Str(n: Int, sys: IntArray): String {
        var multiply = 1
        var even = 0

        for (item in sys.indices) {
            multiply *= sys[item]
        }

        for (item in sys) {
            if (item % 2 == 0) {
                even += 1
            }
        }

        return when {
            multiply <= n -> "Not applicable"
            even > 1 -> "Not applicable"
            else -> sys.map { n % it}.joinToString(
                prefix = "-",
                postfix = "-",
                separator = "--"
            )
        }
    }
}

class  ModSystemTest {

    private fun testing(n: Int, bases: IntArray, expect: String) {
        val actual: String = ModSystem.fromNb2Str(n, bases)
        assertEquals(expect, actual)
    }
    @Test
    fun basicTests() {
        testing(779, intArrayOf(8,7,5,3), "-3--2--4--2-")
        testing(187, intArrayOf(8,7,5,3), "-3--5--2--1-")
        testing(259, intArrayOf(8,7,5,3), "-3--0--4--1-")
        testing(15, intArrayOf(8,6,5,3), "Not applicable")
        testing(15, intArrayOf(3, 2), "Not applicable")

    }
}

fun main(){
    println(ModSystem.fromNb2Str(779, intArrayOf(8,7,5,3)))
}