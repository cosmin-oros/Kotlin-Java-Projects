package Codewars

fun persistence(num: Int) : Int {
    var n = num
    var number = num
    var p = 1
    var counter = 0
    while (number>=10){
        while (n>0){
            p*=n%10
            n/=10
        }
        number = p
        n = p
        p = 1
        counter++
    }
    return counter
}

fun main(){
    println(persistence(999))
}