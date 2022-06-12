package Codewars

import org.junit.Test
import kotlin.test.assertEquals

class PointViewTest {
    fun testing0(a: Int, b: Int) {
        val methods = PointView::class.java.methods
        var actual = false
        for (method in methods) {
            if (method.name.equals("point")) {
                val returnType = method.returnType
                if (returnType.name.substring(0, 29) == "kotlin.jvm.functions.Function")
                    actual = true
            }
        }
        assertEquals(true, actual)
        val actual1 = PointView.fst(PointView.point(a, b))
        assertEquals(a, actual1)
        val actual2 = PointView.snd(PointView.point(a, b))
        assertEquals(b, actual2)
    }
    fun testing2(a1: Int, b1: Int, a2: Int, b2: Int, expect: Int) {
        val actual = PointView.sqrDist(PointView.point(a1, b1), PointView.point(a2, b2))
        assertEquals(expect, actual)
    }
    fun testing3(a1: Int, b1: Int, a2: Int, b2: Int, expect: IntArray) {
        val actual = PointView.line(PointView.point(a1, b1), PointView.point(a2, b2))
        assertEquals(expect, actual)
    }
    @Test
    fun test0() {
        println("Basic Tests Function Point, fst, snd");
        testing0(3, 4);
        testing0(24, 37);
        testing0(17, 98);

    }
    @Test
    fun test1() {
        println("Basic Tests sqrDist");
        testing2(22, 55, 75, 66, 2930);
        testing2(11, 22, 65, 44, 3400);

    }
    @Test
    fun test2() {
        println("Basic Tests line")
        testing3(20, 22, 29, 10, intArrayOf(4, 3, -146))
        testing3(38, 32, 14, 8, intArrayOf(24, -24, -144))

    }
}

object PointView {
    fun point(a: Int, b: Int): (Boolean) -> Int {
        return { x -> if (x) a else b}
    }
    fun fst(pt: (Boolean) -> Int): Int {
        return pt(true)
    }
    fun snd(pt: (Boolean) -> Int): Int {
        return pt(false)
    }
    fun sqrDist(pt1: (Boolean) -> Int, pt2: (Boolean) -> Int): Int {
        val d1 = fst(pt1) - fst(pt2)
        val d2 = snd(pt1) - snd(pt2)
        return d1 * d1 + d2 * d2
    }
    fun line(pt1: (Boolean) -> Int, pt2: (Boolean) -> Int): IntArray {
        val x1 = fst(pt1)
        val y1 = snd(pt1)
        val x2 = fst(pt2)
        val y2 = snd(pt2)
        val dx = x2 - x1
        val dy = y2 - y1
        return intArrayOf(-dy, dx, dy * x1 - dx * y1)
    }
}

fun main(){
    println(PointView.line(PointView.point(20, 22), PointView.point(29, 10)).toList())
}