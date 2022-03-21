package Codewars

fun outed(meet: Map<String, Int>, boss: String): String {
    val ratings = meet.map {
        when (boss) {
            it.key -> it.value * 2
            else -> it.value
        }
    }
    val overallHappiness = ratings.sum() / ratings.count()
    return if (overallHappiness <= 5) "Get Out Now!" else "Nice Work Champ!"
}

fun main(){
    println(outed(mapOf("tim" to 0, "jim" to 2, "randy" to 0, "sandy" to 7, "andy" to 0, "katie" to 5, "laura" to 1, "saajid" to 2, "alex" to 3, "john" to 2, "mr" to 0), "laura"))
}