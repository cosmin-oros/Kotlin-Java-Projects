package Codewars

fun count(nr:Int):Int {
    var banknotes = 0
    var number = nr
    while (number>0){
        while (number>=500){
            banknotes++
            number-=500
        }
        while (number>=200){
            banknotes++
            number-=200
        }
        while (number>=100){
            banknotes++
            number-=100
        }
        while (number>=50){
            banknotes++
            number-=50
        }
        while (number>=20){
            banknotes++
            number-=20
        }
        while (number>=10){
            banknotes++
            number-=10
        }
        if (number in 1..9){
            return -1
        }

    }
    return banknotes
}
fun main(){
    println(count(530))
}