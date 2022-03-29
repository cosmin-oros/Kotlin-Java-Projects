package Codewars

object Stat {

    fun stat(s: String): String {
        fun String.toSecs() = split("|").map { it.toInt() }.let { it[0] * 3600 + it[1] * 60 + it[2] }
        fun Int.toHmd() = "%02d|%02d|%02d".format(this / 3600, this % 3600 / 60, this % 60)
        if (s.isEmpty()) return ""

        val results = s.split(", ").map { it.toSecs() }.sorted()
        val range = results.last() - results.first()
        val average = results.sum() / results.size
        val median = ((results.size - 1) / 2).let { results.drop(it).dropLast(it).average().toInt() }
        return "Range: ${range.toHmd()} Average: ${average.toHmd()} Median: ${median.toHmd()}"
    }
}

fun main(){
    println(Stat.stat("01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"))
}