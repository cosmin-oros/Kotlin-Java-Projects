package Codewars

fun ultimateArrayReverser(a: List<String>):List<String> {
    var contentsReversed = a.joinToString("").reversed()
    val output = mutableListOf<String>()
    for (word in a) {
        val newWord = contentsReversed.take(word.length)
        contentsReversed = contentsReversed.drop(word.length)
        output.add(newWord)
    }
    return output
}

fun main(){
    var s = listOf<String>("I", "like", "big", "butts", "and", "I", "cannot", "lie!")
    println(ultimateArrayReverser(s))
}