package Codewars

import org.junit.Assert.*
import org.junit.Test

class VolTankTest {
    @Test
    fun test0() {
        println("Fixed Tests")
        assertEquals(2940, tankVol(5, 7, 3848))
        assertEquals(245, tankVol(1, 4, 1256))
    }

}

fun tankVol(h:Int, d:Int, vt:Int): Int {

    val R: Double = d / 2.0
    val H: Double = h.toDouble()

    var res: Double = 0.0
    var trigArea: Double = 0.0
    var sectorArea: Double = 0.0

    var length: Double = vt/(Math.PI * Math.pow(R, 2.0))
    val b: Double = Math.sqrt(Math.pow(R, 2.0) - Math.pow((R - H), 2.0)) * 2
    val alpha: Double = Math.asin((b/2)/R) * 2 // In radians

    if (h <= R) {
        trigArea = (R - h) * b / 2

        sectorArea = Math.pow(R, 2.0) * alpha / 2

        res = sectorArea - trigArea
        res *= length
    } else {
        trigArea = (h - R) * b / 2

        sectorArea = Math.pow(R, 2.0) * alpha / 2

        res = Math.PI * Math.pow(R, 2.0) - (sectorArea - trigArea)
        res *= length
    }

    return res.toInt()
}

fun main(){
    println(tankVol(5, 7, 3848))
}