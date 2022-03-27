package Codewars

fun doors(n:Int):Int{
    val doorsOpen = Array(n){false}
    repeat(n){s->for (i in s until n step s+1) doorsOpen[i] = !doorsOpen[i]}
    return doorsOpen.filter{it}.size
}

fun main(){
    println("Doors left open: "+doors(7))
}