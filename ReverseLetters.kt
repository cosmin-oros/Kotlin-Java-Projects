package Codewars

fun reverse(str:String):String=StringBuilder(str).reverse().toString()

fun main(){
    println(reverse("John"))
}