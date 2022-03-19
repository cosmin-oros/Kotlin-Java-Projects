package Codewars

import kotlin.math.ceil

fun movie(card:Int, ticket:Int, perc:Double):Int {
    var systemA = 0
    var systemB = card.toDouble()
    var prev = ticket.toDouble()
    var times = 0
    while (systemA <= ceil(systemB))
    {
        systemA += ticket
        prev *= perc
        systemB += prev
        times += 1
    }
    return times
}

fun main(){
    println(movie(15,500,0.90))
}