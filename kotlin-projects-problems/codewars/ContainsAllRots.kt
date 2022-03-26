package Codewars

fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
    val rots = (strng.indices).map { strng.takeLast(it) + strng.dropLast(it) }
    return arr.containsAll(rots)
}

fun main(){
    val s = "bsjq"
    val arr = arrayListOf<String>("bsjq","qbsj", "sjqb", "twZNsslC", "jqbs")
    println("Validity:"+containAllRots(s,arr))
}