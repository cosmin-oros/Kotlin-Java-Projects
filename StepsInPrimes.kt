package Codewars

import java.util.*

fun isPrime(n: Long):Boolean{
    for(i in 2..1000)
        if(n.toInt()!=i&&n.rem(i).toInt()==0) return false
    return true
}

fun stepsInPrimes(step:Int,start:Long,finish:Long):LongArray {
    var list= LongArray(2)
    for(i in start..finish)
        if(isPrime(i)&&isPrime(i+step.toInt())&&(i+step) in start..finish){
            list.set(0,i); list.set(1,i+step);return list
        }
    return longArrayOf()
}

fun main(){
    println(Arrays.toString(stepsInPrimes(2,1,44)))
}