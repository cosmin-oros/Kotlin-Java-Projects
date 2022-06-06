package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class Testtt {
    @Test
    fun twenty() {
        val gen = paperFold()
        listOf(1,1,0,1,1,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1).iterator().forEach {
            assertEquals(it, gen.next())
        }
    }
}

fun paperFold(): Iterator<Int> {
    var index = 0
    val y = (1..(1 shl 20)).map { (it shr Integer.numberOfTrailingZeros(it) + 1).inv() and 1 }

    return iterator {
        while (index < y.lastIndex) {
            yield(y[index++])
        }
    }
}

fun main(){
    val gen = paperFold()
    gen.iterator().forEach {
        println(it)
    }
}

