package Codewars

import org.junit.Test
import kotlin.test.assertEquals

class Suite2Test {

    @Test
    fun basicTests() {
        assertEquals("[800]", Suite2.game(40))
        assertEquals("[10201, 2]", Suite2.game(101))

    }
}

object Suite2 {
    fun game(n: Long): String {
        return if (n % 2 == 0L)
            String.format("[%d]", n * n / 2)
        else
            String.format("[%d, 2]", n * n, 2)
    }
}

fun main(){
    println(Suite2.game(40))
}