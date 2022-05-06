package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class TestE {
    @Test
    fun `Basic Tests`() {
        assertEquals(true, jumping(intArrayOf(2,3,1,1,4)))
        assertEquals(false, jumping(intArrayOf(3,2,1,0,4)))
        assertEquals(true, jumping(intArrayOf(1,2,0,3,0,0,0)))
        assertEquals(false, jumping(intArrayOf(1,2,0,3,0,0,0,9)))
        assertEquals(false, jumping(intArrayOf(0,1,2,3)))
        assertEquals(true, jumping(intArrayOf(4,0,0,0,1)))
        assertEquals(true, jumping(intArrayOf(9,3,2,1,0,3,2,1,0,1)))
    }
}

fun jumping(arr: IntArray) : Boolean {
    var m = arr[0];
    if (m==0) return false;
    for ((i, v) in arr.withIndex()) {
        if (i==0 || i==arr.size-1) continue;
        m = Math.max(m-1, v);
        if (m<=0) return false;
    }
    return true;
}

fun main(){
    println(jumping(intArrayOf(9,3,2,1,0,3,2,1,0,1)))
}