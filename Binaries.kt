package Codewars

fun code(s: String)= s.map {
    "$it".toInt().toString(2).run {
        "0".repeat(length - 1) + "1" + this
    }
}.joinToString("")

fun decodee(s: String):String{
    var bits = 0
    var tempStr = ""
    var counter = -1
    while( ++counter < s.length){
        if(s[counter] == '1'){
            tempStr += "${s.substring(counter + 1, counter + ++bits + 1).toInt(2)}"
            counter += bits
            bits = 0
        }else bits++
    }
    return tempStr
}

fun main(){
    var s = "10111213"
    s = code(s)
    println(s)
    s = decodee(s)
    println(s)
}