package Codewars

fun stringExpansion(s: String): String = buildString{
    var numberPrefix = 1
    s.forEach {
        if (it in "0123456789"){
            numberPrefix = it.toString().toInt()
        }
        else{
            append(it.toString().repeat(numberPrefix))
        }
    }
}

fun main(){
    println(stringExpansion("3a4B2d"))
}