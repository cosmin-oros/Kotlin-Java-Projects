package Codewars

fun fortune(f0:Int, p:Double, c0:Int, n:Int, i:Double):Boolean {
    var f : Double = f0.toDouble()
    var years=n
    var withdrawable=c0.toDouble()
    while (years>0 && f>0){
        f+=(f*p)
        f-=withdrawable
        withdrawable+=(withdrawable*i)
        years--
    }
    return years==0
}

fun main(){
    println(fortune(100000,0.01,9185,12,0.01))
}