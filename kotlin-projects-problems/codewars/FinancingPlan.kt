package Codewars

import java.math.BigInteger

object Finance {

    fun finance(n: Int): BigInteger {
        var j = 0
        var weeks = n
        var moneyOnFirstDay = 0
        var money : BigInteger = moneyOnFirstDay.toBigInteger()
        while (weeks>=0){
            for (i in j..n){
                money+=(moneyOnFirstDay+i-j).toBigInteger()
            }
            j++
            moneyOnFirstDay+=2
            weeks--
        }
        return money
    }
}

fun main(){
    println("You saved $${Finance.finance(5000)}")
}