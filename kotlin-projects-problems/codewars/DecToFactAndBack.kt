package Codewars

import org.junit.Test
import kotlin.test.assertEquals

object Dec2Fact {
    fun dec2FactString(n: Long): String {
        var s = "0"
        var dec = n
        var divider = 1
        while (dec>0){
            divider++
            val d = (dec%divider).toInt()
            val c = if(d>9) 'A'+(d-10) else '0'+d
            dec /= divider
            s = "$c$s"
        }
        return s;
    }

    fun factString2Dec(str: String): Long {
        var dec = 0L
        var len = str.length
        str.map{if (it>='A') it-'A'+10 else it-'0'}.forEach { i ->
            dec = dec*len+i
            len--
        }
        return dec
    }
}

class  Dec2FactTest {

    private fun testing1(nb: Long, expect: String) {
        val actual: String = Dec2Fact.dec2FactString(nb)
        assertEquals(expect, actual)
    }
    private fun testing2(str: String, expect: Long) {
        val actual: Long = Dec2Fact.factString2Dec(str)
        assertEquals(expect, actual)
    }
    @Test
    fun basicTests1() {
        testing1(36288000L, "A0000000000")
        testing1(2982L, "4041000")
        testing1(463L, "341010")

    }
    @Test
    fun basicTests2() {
        testing2("341010", 463L)
        testing2("4042100", 2990L)
        testing2("27A0533231100", 1273928000L)

    }
}

fun main(){
    var a = Dec2Fact.dec2FactString(463L)
    println(a)
    println(Dec2Fact.factString2Dec(a))
}