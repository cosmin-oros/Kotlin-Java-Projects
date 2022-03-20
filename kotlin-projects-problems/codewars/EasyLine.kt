package Codewars

import java.math.BigInteger;

fun easyLine(n:Int):BigInteger {
    var sum = BigInteger ("0")

    for (m in 0..n + 1){
        sum += (factorial(n)/ (factorial(m) * factorial(n - m))).pow(2)
    }
    return sum
}

fun factorial(n: Int): BigInteger = if (n <= 1) BigInteger("1") else n.toBigInteger().times( factorial(n - 1))

fun main(){
    println(easyLine(4))
}