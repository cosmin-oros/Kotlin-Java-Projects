package Codewars

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals


inline fun unless(boolean: Boolean, block: () -> Unit) = if (!boolean) block() else Unit

inline fun until(condition: () -> Boolean, block: () -> Unit) {
    while (!condition()) block()
}

inline fun forceRun(block: () -> Unit) = try {
    block()
} catch (e: Exception) {
}

class KotlinTricks2 {
    private fun testUnlessHelper(boolean: Boolean) {
        var int = 1
        unless(boolean) { int = 2 }
        assertEquals(if (boolean) 1 else 2, int)
    }

    private fun testUntilHelper(boolean: Int) {
        var int = 1
        var cond = boolean
        until({ (cond--) == 0 }) { int++ }
        assertEquals(boolean + 1, int)
    }

    @Test
    fun testUnless() {
        val r = java.util.Random(System.currentTimeMillis())
        (0..30).forEach { testUnlessHelper(r.nextBoolean()) }
    }

    @Test
    fun testUntil() {
        val r = java.util.Random(System.currentTimeMillis())
        (0..30).forEach { testUntilHelper(Math.abs(r.nextInt(10))) }
    }

    @Test
    fun testForceRun() {
        val r = java.util.Random(System.currentTimeMillis())
        (0..30).forEach { forceRun { listOf(1)[r.nextInt()] } }
        var a = 1
        forceRun { a = 2 }
        assertEquals(a, 2)
    }
}

fun main(){

}