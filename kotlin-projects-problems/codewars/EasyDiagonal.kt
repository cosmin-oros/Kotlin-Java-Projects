package Codewars

import java.math.BigInteger
import org.junit.Test
import kotlin.test.assertEquals

class DiagonalTest {

    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3))
        assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4))
        assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5))

    }
}

object Diagonal {

    fun diagonal(line: Int, pale: Int) = pascal(line-pale, pale+1)

    private fun pascal(x: Int, y: Int): BigInteger {
        val (i, n) = if (x > y) x to y else y to x
        return (i+1..Int.MAX_VALUE).zip(1..n).fold(big(1)) {
                acc, (a, b) -> acc * big(a) / big(b)
        }
    }
    private fun big(x: Int) = x.toBigInteger()
}

fun main(){
    println(Diagonal.diagonal(20, 3))
    println(Diagonal.diagonal(20, 4))
    println(Diagonal.diagonal(20, 5))
}