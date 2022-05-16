package Codewars

import org.junit.Test
import kotlin.test.assertEquals

class  DirReductionTest {

    private fun testing(arr: Array<String>, expect: Array<String>) {
        val actual: Array<String> = DirReduction.dirReduc(arr)
        assertEquals(expect.contentDeepToString(), actual.contentDeepToString())
    }
    @Test
    fun basicTests() {
        var a = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
        testing(a, arrayOf("WEST"))
        a = arrayOf("NORTH", "WEST", "SOUTH", "EAST")
        testing(a, arrayOf("NORTH", "WEST", "SOUTH", "EAST"))
        a = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH")
        testing(a, arrayOf("NORTH"))
        a = arrayOf("NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH")
        testing(a, arrayOf("NORTH", "EAST"))
        a = arrayOf("")
        testing(a, arrayOf(""))

    }
}

object DirReduction {
    fun dirReduc(arr: Array<String>) = arr.map{it.uppercase()}.toMutableList().apply {
        var ptr = 0
        var found = false
        do {
            if(size<2) break
            if(ptr==0) found = false
            val two = listOf(this[ptr],this[ptr+1]).sorted().joinToString(" ")
            if(two in "NORTH SOUTH  EAST WEST") {
                (0..1).forEach{removeAt(ptr)}
                found = true
            }
            ptr++; if(ptr>size-2) ptr = 0
        } while( !(ptr==0 && found==false) )
    }.toTypedArray()
}

fun main(){
    println(DirReduction.dirReduc(arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")).toList())
}