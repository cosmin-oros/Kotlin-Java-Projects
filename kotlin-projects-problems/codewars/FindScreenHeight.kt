package Codewars

fun findHeight(width:Int,ratio:String):String{
    val (w,h) = ratio.split(":").map { it.toInt() }
    return "${width}:${width*h/w}"
}

fun main(){
    println(findHeight(1280,"16:9"))
}