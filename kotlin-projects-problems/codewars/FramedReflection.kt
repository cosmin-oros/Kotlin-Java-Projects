package Codewars

fun mirror(text: String): String {
    val largo = text.split(" ").maxByOrNull { it.length }!!.length
    var topBottom = largo?.let { "*".repeat((it + 4)) }
    val top = "$topBottom\n"
    val bottom = "\n$topBottom"

    val reversedList = text.reversed().split(" ").reversed().toMutableList().also {
        it.forEachIndexed { index, s ->
            if (index == it.size-1){
                it[index] = "* $s ${" ".repeat(largo!! - s.length)}*"

            }else{
                it[index] = "* $s ${" ".repeat(largo!! - s.length)}*\n"
            }
        }
        it.add(0, top)
        it.add(it.size, bottom)
    }


    return reversedList.joinToString("")
}

fun main(){
    print(mirror("Hello world!"))
}