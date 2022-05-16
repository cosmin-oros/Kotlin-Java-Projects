package Codewars

import org.junit.Assert.*
import org.junit.Test

class factDecompTest {

    private fun testing(n:Int, expect:String) {
        val actual = decomp(n)
        assertEquals(expect, actual)
    }
    @Test
    fun test() {
        testing(17, "2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17");
        testing(5, "2^3 * 3 * 5");
        testing(22, "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19");
        testing(14, "2^11 * 3^5 * 5^2 * 7^2 * 11 * 13");
        testing(25, "2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23");

    }
}

fun putPrimesInMap(n: Int, map: HashMap<Int, Int>) {
    var factor = 2
    var x = n
    while (x > 1) {
        while (x % factor != 0)
            factor++
        if (map.containsKey(factor))
            map[factor] = map.getValue(factor) + 1
        else
            map[factor] = 1
        x /= factor
        factor = 2
    }
}


fun decomp(m: Int): String {
    val hashMap = HashMap<Int, Int>()
    val result = mutableListOf<String>()

    for (i in 2..m)
        putPrimesInMap(i, hashMap)
    for (key in hashMap.keys.sorted()) {
        if (hashMap[key] == 1)
            result.add("$key")
        else
            result.add("${key}^${hashMap[key]}")
    }

    return result.joinToString(" * ")
}

fun main(){
    println(decomp(17))
}