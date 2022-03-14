package Codewars

fun KIllKthBit(n:Int,k:Int):Int {
    return n and (1 shl k-1).inv()
}

fun main(){
    println(KIllKthBit(37,3))
}