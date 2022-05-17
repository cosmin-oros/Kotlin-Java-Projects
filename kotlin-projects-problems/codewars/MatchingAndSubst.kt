package Codewars

import org.junit.Test
import kotlin.test.assertEquals

class MatchSubstTest {
    private fun dotest(s: String, prog: String, version: String, exp: String) {
        val ans = MatchSubst.change(s, prog, version)
        assertEquals(exp, ans)
    }
    @Test
    fun test() {
        println("Basic Tests");
        val s1 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha"
        dotest(s1, "Ladder", "1.1", "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 1.1")

        val s14 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7.5\nLevel: Alpha"
        dotest(s14, "Ladder", "1.1", "ERROR: VERSION or PHONE")

    }
}

object MatchSubst {

    fun change(s: String, prog: String, version: String) =
        s.split("\n")
            .map {
                val arr = it.split(": ")
                val el = Pair(arr.first(), arr.last())

                when (el.first) {
                    "Program title" -> "Program: $prog"
                    "Author"        -> "Author: g964"
                    "Date"          -> "Date: 2019-01-01"
                    "Phone"         -> {
                        if (!el.second.matches("\\+[1]-\\d{3}-\\d{3}-\\d{4}".toRegex())) {
                            return "ERROR: VERSION or PHONE"
                        } else {
                            "Phone: +1-503-555-0090"
                        }
                    }
                    "Version"       -> {
                        if (!el.second.matches("\\d+\\.\\d+".toRegex())) {
                            return "ERROR: VERSION or PHONE"
                        } else {
                            if (el.second != "2.0") {
                                "Version: $version"
                            } else {
                                "Version: ${el.second}"
                            }
                        }
                    }
                    else            -> null
                }
            }.filterNotNull()
            .joinToString(" ")
}

fun main(){
    println(MatchSubst.change("Ladder", "1.1", "ERROR: VERSION or PHONE"))
}