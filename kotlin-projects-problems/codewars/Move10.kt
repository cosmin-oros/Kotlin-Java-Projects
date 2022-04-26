package Codewars

import kotlin.test.assertEquals
import org.junit.Test

fun moveTen(s: String): String {
    var aux: Char
    val myLis = s.toMutableList()
    s.forEachIndexed { index, c ->
        aux = c + 10
        if (!aux.isLetter()) {
            aux = 'a' + (aux - 'z') - 1
        }
        myLis[index] = aux
    }
    return myLis.joinToString("")
}
class test {
    @Test
    fun `test`() {
        assertEquals("docdmkco", moveTen("testcase"))
        assertEquals("mynogkbc", moveTen("codewars"))
        assertEquals("ohkwzvodocdrobo", moveTen("exampletesthere"))
    }
}


fun main(){
    println(moveTen("testcase"))
}