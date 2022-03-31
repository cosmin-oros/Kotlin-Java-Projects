package Codewars

fun countRedBeads(nBlue: Int): Int{
    if(nBlue<2){
        return 0
    }
    return (nBlue-1)*2
}

fun main(){
    println(countRedBeads(6))
}