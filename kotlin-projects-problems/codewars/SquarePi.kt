package Codewars

import kotlin.math.sqrt
import kotlin.math.ceil

val pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"

fun squarePi(digits: Int): Int {
    val n = pi.take(digits).map(Character::getNumericValue).map{it*it}.sum().toDouble()
    return ceil(sqrt(n)).toInt()
}

fun main(){
    println(squarePi(3))
}