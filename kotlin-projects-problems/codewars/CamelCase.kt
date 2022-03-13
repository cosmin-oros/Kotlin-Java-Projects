package Codewars

fun toCamelCase(str:String):String {
    return str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
}
fun main(){
    println(toCamelCase("Ana has apples"))
}