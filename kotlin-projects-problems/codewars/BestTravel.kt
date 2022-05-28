package Codewars

import org.junit.Assert.*
import org.junit.Test
import java.util.ArrayList
import java.util.Arrays

class SumOfKTest {
    //----------------
    @Test
    fun BasicTests1() {
        println("****** Basic Tests small numbers******")
        var ts = ArrayList<Int>(Arrays.asList<Int>(50, 55, 56, 57, 58))
        var n = chooseBestSum(163, 3, ts)
        assertEquals(163, n.toLong())
        ts = ArrayList<Int>(Arrays.asList<Int>(50))
        var m = chooseBestSum(163, 3, ts)
        assertEquals(-1, m)

    }

}

fun chooseBestSum(t:Int, k:Int, ls:List<Int>):Int {
    val result = combinations(t, k, ls, 0)
    if (result > 0) {
        return result
    }
    return -1
}

fun combinations(t:Int, k:Int, ls:List<Int>, i:Int):Int {
    if (k == 0 && t >= 0) {
        return 0
    } else if (k < 0 || i>= ls.size) {
        return Integer.MIN_VALUE
    } else  {
        return Integer.max(combinations(t, k, ls, i + 1), ls.get(i) + combinations(t - ls.get(i), k - 1, ls, i + 1))
    }
}

fun main(){
    println(chooseBestSum(163, 3, ArrayList<Int>(Arrays.asList<Int>(50, 55, 56, 57, 58))))
}