package Codewars

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.math.sqrt
import kotlin.math.floor

class SumSquaredDivisorsTest {

    @Test
    fun basicTests() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250))
        assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250))

    }
}

object SumSquaredDivisors {

    //There are more efficient ways
    private fun getDivisors(number: Long) : List<Long> {
        val divisors = mutableListOf<Long>()
        var i: Long = 1
        while(i * i <= number) {
            if(number % i == 0L) {
                divisors.add(i)
                val partner = number / i
                if(i != partner) divisors.add(partner)
            }
            i += 1
        }
        return divisors
    }

    fun listSquared(m: Long, n: Long): String {
        val candidates = m..n
        val result = mutableListOf<List<Long>>()
        for(candidate in candidates) {
            val divisors = getDivisors(candidate)
            val squaredSum = divisors.reduce { acc, elem -> acc + elem * elem }.toDouble()
            val root = floor(sqrt(squaredSum))
            if(root * root == squaredSum) result.add(listOf(candidate, squaredSum.toLong()))
        }
        return result.toString()
    }
}

fun main(){
    println(SumSquaredDivisors.listSquared(1, 250))
}