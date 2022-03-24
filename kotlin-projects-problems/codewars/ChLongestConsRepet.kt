package Codewars

object KataSolution {
    fun longestRepetition(s: String): Pair<Char?, Int>{
        if(s.isBlank()) {
            return Pair(null, 0)
        } else {
            var currentChar: Char? = null
            var resChar: Char? = null
            var count = 0
            var max = 0
            s.forEach { x ->
                if(x == currentChar){
                    count++
                } else {
                    currentChar = x
                    count = 1
                }
                if (count > max){
                    max = count
                    resChar = currentChar
                }
            }
            return Pair(resChar, max)

        }
    }
}

fun main(){
    println(KataSolution.longestRepetition("ccdddaabbbbd"))
}