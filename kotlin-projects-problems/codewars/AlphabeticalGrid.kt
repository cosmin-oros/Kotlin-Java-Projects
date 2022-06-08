package Codewars


import org.junit.Test
import kotlin.test.assertEquals

class ExTests {
    fun runTest(n: Int, refSol: String?) = assertEquals(refSol,Kata.grid(n))

    @Test fun `Valid tests`() {
        runTest(0, "")
        runTest(1, "a")
        runTest(2, "a b\nb c")
        runTest(4, "a b c d\nb c d e\nc d e f\nd e f g")
        runTest(6, "a b c d e f\nb c d e f g\nc d e f g h\nd e f g h i\ne f g h i j\nf g h i j k")
    }

    @Test fun `Invalid tests`() {
        runTest(-1, null)
        runTest(-5, null)
    }
}

object Kata {

    private const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"

    fun grid(n: Int): String? {
        if (n < 0) return null

        val str = java.lang.StringBuilder()
        for (row in 0 until n) {
            for (col in 0 until n) {
                str.append(ALPHABET[(row + col) % ALPHABET.length])
                if (col < n - 1) str.append(" ")
            }
            if (row < n - 1) str.append("\n")
        }

        return str.toString()
    }
}

fun main(){
    println(Kata.grid(0))
}