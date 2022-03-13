package Codewars

fun alternateCapitalization(text:String):List<String> {
    return listOf(
        text.mapIndexed { index, string -> if(index % 2 == 0 )string.toUpperCase() else string }.joinToString(""),
        text.mapIndexed { index, string -> if(index % 2 == 0 )string else string.toUpperCase() }.joinToString("")
    )
}
fun main(){
    println(alternateCapitalization("Ana are mere DAaA").toList())
}