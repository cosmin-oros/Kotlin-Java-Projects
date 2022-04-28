package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class SampleTests {
    @Test
    fun tests() {
        assertEquals(-1, maxPizza(-2))
        assertEquals(1, maxPizza(0))
        assertEquals(7, maxPizza(3))
        assertEquals(11, maxPizza(4))
        assertEquals(16, maxPizza(5))
        assertEquals(22, maxPizza(6))
    }
}

fun maxPizza(cuts: Int) = when{
    cuts<0 -> -1
    cuts==0 -> 1
    else -> (cuts*cuts + cuts + 2)/2
}

fun main(){
    println(maxPizza(5))
}