package Codewars

import org.junit.Test
import org.junit.Assert.*;

class TestFindLast {
    @Test
    fun `Basic tests`() {
        assertArrayEquals(intArrayOf(35,4238), findLast(75, 34))
        assertArrayEquals(intArrayOf(48,5091), findLast(82, 49))
        assertArrayEquals(intArrayOf(61,3996), findLast(73, 38))
        assertArrayEquals(intArrayOf(10,6275), findLast(86, 71))
        assertArrayEquals(intArrayOf(26,3000), findLast(61, 17))
        assertArrayEquals(intArrayOf(12,1578), findLast(42, 38))
        assertArrayEquals(intArrayOf(28,740), findLast(29, 5))
        assertArrayEquals(intArrayOf(43,3327), findLast(64, 49))
        assertArrayEquals(intArrayOf(32,2922), findLast(61, 20))
        assertArrayEquals(intArrayOf(59,5856), findLast(88, 52))
        assertArrayEquals(intArrayOf(2,6), findLast(3, 3))
        assertArrayEquals(intArrayOf(2,8), findLast(3, 4))
    }
}

fun findLast(n: Int, m: Int) : IntArray {
    var result:Int = 0
    var last:Int = 0
    // identifiers of players who have lost
    var eliminated: Array<Int> = emptyArray()

    for (i in n downTo 2)
    {
        // if number of people left is less than number of 1 coin step - just add number of steps
        // else add number of 1 coin step and 2 * number of people left
        result += if (m > i) { m } else { m + (i-m)*2 }
        // find the last player to score 1 coin ignoring the losers
        last = findNext(eliminated,last,m,n)
        // add current player to losers
        eliminated += last
    }
    last = findNext(eliminated,last,m,n)
    if( last == 0 )
        last = n
    var arr: IntArray = intArrayOf(last,result)
    return arr
}

fun findNext(eliminated:Array<Int>, last:Int, m:Int, size:Int):Int
{
    var temp:Int = last
    var step:Int = m
    var result:Int = last
    while( step > 0 )
    {
        temp++
        if( temp >= size )
            temp = 0

        if(!eliminated.contains(temp))
        {
            result = temp
            step--
        }
    }
    return result
}

fun main(){
    println(findLast(3,4).toList())
}