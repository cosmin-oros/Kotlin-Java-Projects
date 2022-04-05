package Codewars

fun maxRot(n:Long):Long {

    val numberList = arrayListOf<Long>()
    numberList.add(n)
    var text = n.toString()

    (1 until n.toString().length).forEach { t ->
        text = text.removeRange(t-1, t) + text[t-1]
        numberList.add(text.toLong())
    }

    return numberList.reduce{ max, element -> if(element > max) element else max}
}

fun main(){
    println(maxRot(56789))
}