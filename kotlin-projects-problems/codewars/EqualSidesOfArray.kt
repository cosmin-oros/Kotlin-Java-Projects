package Codewars

import org.junit.Assert.*
import java.util.ArrayList
import org.junit.Test

class KataTest {
    @Test
    fun test() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 100, 50, -51, 1, 1)))
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 5, 6)))
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(20, 10, 30, 10, 10, 15, 35)))
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(-8505, -5130, 1926, -9026)))
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(2824, 1774, -1490, -9084, -9696, 23094)))
        assertEquals(6, EqualSidesOfAnArray.findEvenIndex(intArrayOf(4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4)))
    }
}

object EqualSidesOfAnArray {
    fun findEvenIndex(arr:IntArray):Int {
        var rightSum = arr.sum()
        var leftSum = 0
        for (i in 0..arr.size-1) {
            rightSum = rightSum - arr[i]
            if (rightSum == leftSum) return i
            leftSum = leftSum + arr[i]
        }
        return -1
    }
}

fun main(){
    println(EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
}