package Codewars

import java.math.BigInteger
import java.math.BigInteger.*

fun fcn(n:Int): BigInteger {
    return ONE.shiftLeft(n)
}
fun main(){
    println(fcn(17))
}