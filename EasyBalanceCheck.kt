package Codewars

object EasyBalance {

    fun balance(book: String): String {
        val str = book.split("\n").toMutableList()
        val patternCount = Regex("""(\d+\.\d{2})""")
        val patternNumber = Regex("""(\d+)""")
        val patternWord = Regex("""[A-Za-z]+""")
        var balance = patternCount.find(str.first())!!.value.toDouble()
        val total = mutableListOf<Double>()

        str[0] = ""

        val res = buildString {
            append("Original Balance: ${String.format("%.2f", balance)}\\r\\n")

            for (item in str){
                if (str.first() == item) continue
                val count = patternCount.find(item)!!.value.toDouble()

                total.add(count)
                append(patternNumber.find(item)!!.value).append(" ")
                append(patternWord.find(item)!!.value).append(" ")
                append("${String.format("%.2f",count)} ")
                append("Balance ${String.format("%.2f", balance - count)}\\r\\n")
                balance -= count

            }
            append("Total expense  ${String.format("%.2f", total.sum())}\\r\\n")
            append("Average expense  ${String.format("%.2f", total.average())}")
        }
        return res
    }
}

fun main(){
    println(EasyBalance.balance("1000.00!=\\n125 Market !=:125.45\\n126 Hardware =34.95\\n127 Video! 7.45\\n128 Book :14.32\\n129 Gasoline ::16.10\\n"))
}