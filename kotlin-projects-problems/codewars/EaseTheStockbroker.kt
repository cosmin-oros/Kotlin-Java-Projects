package Codewars

object OrdersSummary {
    fun balanceStatements(lst: String): String {

        if (lst.isBlank()) return "Buy: 0 Sell: 0"

        var bad = mutableListOf<String>()
        var b = 0.0
        var s = 0.0

        for (order in lst.split(", ")) {
            val match = "^([^\\s]+)\\s(\\d+)\\s(\\d+\\.\\d+)\\s([BS])$".toRegex().find(order)

            if (match == null) bad.add(order + " ;")
            else {
                var (m, quote, quantity, price, t) = match.groupValues
                val p = quantity.toInt() * price.toDouble()
                if (t == "B") b += p else if (t == "S") s += p
            }
        }
        val bf = if (bad.isEmpty()) "" else "; Badly formed ${bad.size}: ${bad.joinToString("")}"
        return String.format("Buy: %.0f Sell: %.0f%s", b, s, bf)
    }
}

fun main(){
    println(OrdersSummary.balanceStatements("GOOG 300 542.0 B"))
}