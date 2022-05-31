package Codewars

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.floor
import kotlin.math.sqrt

class sectionTest {
    private fun testing(k: Long, expected: Int) {
        val actual: Int = c(k)
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        testing(10336225, 16)
        testing(2961841, 4)
        testing(13396105, 0)
        testing(10017225, 64)
        testing(25, 4)

    }
}

/*
*
*  z^3     = x^2 * y^2
*
*  (r^2)^3 = x^2 * y^2   // z = r^2
*  r^6     = x^2 * y^2
*  r^6     = (x*y)^2     //sqrt
*  r^3     = x*y
*/
fun c(`r^2`: Long): Int {
    if (isSquareRoot(`r^2`).not()) return 0

    val `r^3` = promoteToCubicRoot(`r^2`)
    val xy = `r^3`
    return countPrimeFactors(xy).toInt()
}

fun countPrimeFactors(value: Long): Long {
    var primeFactors = 1L
    var number = value
    (2L..value).forEach { divider ->
        val (divisions, rest) = integerDivisionCount(number, divider)
        number = rest
        primeFactors *= (divisions + 1)
        if (number == 1L) return primeFactors
    }

    return primeFactors
}

fun promoteToCubicRoot(value: Long): Long {
    val valueSquare = value.toDouble().run(::sqrt).toInt()
    return valueSquare * value
}

fun isSquareRoot(value: Long): Boolean {
    val valueSquare = value.toDouble().run(::sqrt)
    return valueSquare.run(::isInteger)
}

fun isInteger(value: Double): Boolean = floor(value) == value

infix fun Long.divisible(other: Long): Boolean = this % other == 0L

data class IntegerDivisionResult(
    val divisions: Long,
    val rest: Long
)

fun integerDivisionCount(startingBase: Long, value: Long): IntegerDivisionResult {
    var divisions = 0L
    var base = startingBase
    while (base divisible value) {
        base /= value
        divisions++
    }
    return IntegerDivisionResult(divisions, base)
}


fun main(){
    println(c(10336225))
}