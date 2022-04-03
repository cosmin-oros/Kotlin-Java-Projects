package Codewars

import kotlin.math.max
import kotlin.math.min

fun gcdi(a:Long, b:Long) = gcd(abs(a), abs(b))

fun gcd(a:Long, b:Long):Long{
    if (b.equals(0)){
        return a
    }
    return gcd(b,a%b)
}

fun lcmu(a:Long, b:Long) = lcm(abs(a), abs(b))

fun lcm(a:Long, b:Long):Long{
    var t = a%b
    if (t.equals(0)){
        return a
    }
    return a* lcm(b,t)/t
}

fun som(a:Long, b:Long) = a + b

fun maxi(a:Long, b:Long) = max(a,b)

fun mini(a:Long, b:Long) = min(a,b)

fun operArray(fct:String, arr:LongArray, init:Long):LongArray {
    var finalArr = LongArray(arr.size)
    when(fct){
        "gcdi"->{
            for (i in arr.indices){
                if (i==0){
                    finalArr[i] = gcdi(init,arr[i])
                }
                else{
                    finalArr[i] = gcdi(finalArr[i-1],arr[i])
                }
            }
        }
        "lcmu"->{
            for (i in arr.indices){
                if (i==0){
                    finalArr[i] = lcmu(init,arr[i])
                }
                else{
                    finalArr[i] = lcmu(finalArr[i-1],arr[i])
                }
            }
        }
        "som"->{
            for (i in arr.indices){
                if (i==0){
                    finalArr[i] = som(init,arr[i])
                }
                else{
                    finalArr[i] = som(finalArr[i-1],arr[i])
                }
            }
        }
        "maxi"->{
            for (i in arr.indices){
                if (i==0){
                    finalArr[i] = maxi(init,arr[i])
                }
                else{
                    finalArr[i] = maxi(finalArr[i-1],arr[i])
                }
            }
        }
        "mini"->{
            for (i in arr.indices){
                if (i==0){
                    finalArr[i] = mini(init,arr[i])
                }
                else{
                    finalArr[i] = mini(finalArr[i-1],arr[i])
                }
            }
        }
        else->{
            println("Wrong function input")
        }//case of wrong function name passed
    }
    return finalArr
}

fun main(){
    val lArr = longArrayOf(2,4,6,8,10,20)
    println(operArray("som",lArr,0).toList())
}