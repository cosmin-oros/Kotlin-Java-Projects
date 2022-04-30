package Codewars

fun beggars(values: List<Int>, n: Int): List<Int>{
    if(n == 0 ) return emptyList()
    var static = mutableMapOf<Int, Int>()
    for(beg in 0 until n) {
        static[beg] = 0
        for((index, value) in values.withIndex()) {
            if ((index - beg) % n == 0)
                static[beg] = static[beg]!! + value
        }
    }
    return static.map { it.value }
}

fun main(){
    println(beggars(listOf(5,3,2,4,1),2))
}