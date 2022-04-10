package Codewars

import org.junit.Test
import java.math.*
import kotlin.math.pow
import kotlin.test.DefaultAsserter.assertEquals

fun mantExp(aNumber: BigDecimal, digitsNumber: Int): String {
    val s = String.format("%.15e", aNumber)
    val a = s.split("e".toRegex(), 2).toTypedArray()
    val exp = digitsNumber - Integer.valueOf(a[1]) - 1
    val man = aNumber.multiply(BigDecimal(10.0.pow(exp.toDouble()))).setScale(0, RoundingMode.FLOOR)
    return man.toString() + "P" + (-exp).toString()
}

//class floatrepresentTest {
//    private fun testing(aNumber: BigDecimal, digitsNumber: Int, exp: String) {
//        println("aNumber: $aNumber")
//        println("digitsNumber: $digitsNumber")
//        val actual = mantExp(aNumber, digitsNumber)
//        println("Actual: $actual")
//        println("Expect: $exp")
//        println("#")
//        assertEquals(exp, actual)
//    }
//    @Test
//    fun test() {
//        var x = BigDecimal("0.06")
//        testing(x, 10, "6000000000P-11")
//        x = BigDecimal("72.0")
//        testing(x, 12, "720000000000P-10")
//        x = BigDecimal("1.0")
//        testing(x, 5, "10000P-4")
//        x = BigDecimal("123456.0")
//        testing(x, 4, "1234P2")
//        x = BigDecimal("1.103000")
//        testing(x, 10, "1103000000P-9")
//
//    }
//
//}

fun main(){
    println(mantExp(BigDecimal("0.06"),10))
}