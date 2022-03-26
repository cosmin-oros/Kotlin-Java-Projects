package Codewars

fun towerOfHanoi(n:Int,start:String,aux:String,end:String){
    if (n==1){
        println("$start -> $end")
    }
    else{
        towerOfHanoi(n-1,start,end,aux)
        println("$start -> $end")
        towerOfHanoi(n-1,aux,start,end)
    }
}

fun main(){
    print("Enter number of discs: ")
    val discs = readLine()?.toInt()
    if (discs!=null){
        towerOfHanoi(discs,"A","B","C")
    }
}