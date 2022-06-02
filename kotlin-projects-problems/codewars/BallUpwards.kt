package Codewars

import org.junit.Assert.*
import org.junit.Test

class ballMainTest {
    private fun testing(actual:Int, expected:Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun test() {
        println("Fixed Tests maxBall")
        testing(maxBall(37), 10)
        testing(maxBall(45), 13)

    }

}

fun maxBall(v0:Int):Int {
    // v0 in km/h -- transform to m/s -- m/(1/10 s)
    val mps: Double = v0 / 3.6
    var timePassed = 1
    var preH: Double = 0.0
    var nextH: Double = getHeight(timePassed/10.0, mps)

    while(preH < nextH) {
        timePassed++

        preH = nextH
        nextH = getHeight(timePassed/10.0, mps)
    }

    return timePassed - 1
}

fun getHeight(timePassed: Double, speed: Double): Double {
    return speed*timePassed - 0.5*(9.81)*timePassed*timePassed
}

fun main(){
    println(maxBall(37))
}