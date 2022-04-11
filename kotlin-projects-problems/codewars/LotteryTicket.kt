package Codewars

import kotlin.test.assertEquals
import org.junit.Test

fun bingo(t: Array<Pair<String, Int>>, w: Int) =
    if (t.count { it.first.any { c -> c.toInt() == it.second } } >= w) "Winner!"
    else "Loser!"

class TestExample {
    @Test
    fun basicTests() {
        assertEquals("Loser!", bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 2))
        assertEquals("Winner!", bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 1))
        assertEquals("Loser!", bingo(arrayOf("HGTYRE" to 74, "BE" to 66, "JKTY" to 74), 3))
    }
}


fun main(){
    println(bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74),2))
}