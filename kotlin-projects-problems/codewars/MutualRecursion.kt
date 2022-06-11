package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class TestExampl {
    fun checkF(input : Int, shouldBe : Int) = assertEquals(f(input), shouldBe)
    fun checkM(input : Int, shouldBe : Int) = assertEquals(m(input), shouldBe)

    @Test
    fun basicTests() {
        checkF(0, 1)
        checkF(5, 3)
        checkF(10, 6)
        checkF(15, 9)
        checkF(25, 16)
        checkM(0, 0)
        checkM(5, 3)
        checkM(10, 6)
        checkM(15, 9)
        checkM(25, 16)
    }
}

fun f(n: Int): Int{
    if (n == 0){
        return 1
    }else{
        return n-m(f(n-1))
    }
}

fun m(n: Int): Int{
    if (n == 0) {
        return 0
    }else{
        return n-f(m(n-1))
    }
}

fun main(){
    println(f(0))
    println(m(0))
}