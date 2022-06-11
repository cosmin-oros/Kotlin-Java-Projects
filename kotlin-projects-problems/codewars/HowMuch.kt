package Codewars

import org.junit.Assert.*
import org.junit.Test

class CarboatTest {
    //----------------
    @Test
    fun BasicTests() {
        println("****** Basic tests ******")
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]",
            howMuch(1, 100))
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11][M: 163 B: 23 C: 18]]",
            howMuch(0, 200))

    }

}

fun howMuch(m: Int,n: Int): String{
    println("$m , $n")

    var result = ""
    if (n > m){
        for (i in m..n){
            if ((i-1) % 9 == 0 && (i-2) % 7 == 0){
                result += "[M: $i B: ${(i - 2) / 7} C: ${(i - 1) / 9}]"
            }
        }
    }else{
        for (i in n..m){
            if ((i - 1) % 9 == 0 && (i - 2) % 7 == 0){
                result += "[M: $i B: ${(i - 2) / 7} C: ${(i - 1) / 9}]"
            }
        }
    }
    return "[$result]"
}

fun main(){
    println(howMuch(0,200))
}