package Codewars

fun prod2Sum(a:Long, b:Long, c:Long, d:Long):List<LongArray> {

    val (e1, f1) = longArrayOf(a*c + b*d, abs(a*d - b*c))
    val (e2, f2) = longArrayOf(abs(a*c - b*d), a*d + b*c)

    return listOf(longArrayOf(e1, f1), longArrayOf(e2, f2))
        .map { it.sortedArray() }
        .sortedWith(Comparator {
                (a, b), (c, d) -> when {
            a < c -> -1
            a > c -> 1
            else -> when {
                b < d -> -1
                b > d -> 1
                else -> 0
            }
        }
        })
        .distinctBy { (a, b) -> "$a:$b" }
}

fun abs(value: Long) = if (value > 0) value else -value

fun main(){
    println(prod2Sum(1,2,1,3))
}