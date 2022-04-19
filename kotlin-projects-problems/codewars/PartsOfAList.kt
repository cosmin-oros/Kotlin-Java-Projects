package Codewars

import org.junit.Assert.*
import java.util.Arrays
import org.junit.Test
import java.util.Random

fun partlist(arr:Array<String>):Array<Array<String>> {
    return (0 until arr.size - 1)
        .map {
            arrayOf(
                arr.sliceArray(0..it).joinToString(" "),
                arr.sliceArray(it + 1 until arr.size).joinToString(" ")
            )
        }.toTypedArray()
}

class PartlistTest {
    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        println("Fixed Tests partlist")
        var s1 = arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")
        var a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
        testing(Arrays.deepToString(partlist(s1)), a)
        s1 = arrayOf<String>("I", "wish", "I", "hadn't", "come")
        a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
        testing(Arrays.deepToString(partlist(s1)), a)

    }
}

fun main(){
    partlist(arrayOf<String>("cdIw", "tzIy", "xDu", "rThG"))
}