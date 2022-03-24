package Codewars

fun addLetters(arr : List<Char>):Char{
    return arr.apply {
        if (this.isEmpty()) return 'z'
    }.map {
        it.code - 96
    }.reduce { acc, value ->
        acc + value
    }.let {
        ((it - 1) % 26 + 97).toChar()
    }
}

fun main(){
    var l = listOf<Char>('a','b','c')
    println(addLetters(l))
}