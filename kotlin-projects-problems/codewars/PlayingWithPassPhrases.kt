package Codewars

object PlayPass {

    fun playPass(s: String, n: Int) = s.map { when {
        it.isUpperCase() -> ((it - 'A' + n) % 26 + 65).toChar()
        it.isDigit() -> '9' - (it - '0')
        else -> it
    } }.mapIndexed { idx, ch -> if (idx % 2 == 1) ch.toLowerCase() else ch }.reversed().joinToString("")
}

fun main(){
    println(PlayPass.playPass("BORN IN 2002!",1))
}