package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class TestEx {
    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}

fun getCount(str: String) = str.sumBy {
    when(it){
        'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> 1
        else -> 0
    }
}

fun main(){
    println(getCount("Ana has apples"))
}