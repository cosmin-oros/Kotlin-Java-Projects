package Codewars

fun highlight(code: String): String {
    return code.replace(Regex("F+|L+|R+|[0-9]+")) {
        "<span style=\"color: %s\">%s</span>"
            .format(
                when (it.groupValues[0][0]) {
                    'F' -> "pink";
                    'L' -> "red";
                    'R' -> "green";
                    else -> "orange";
                }, it.groupValues[0]);
    };
}

fun main(){
    println(highlight("FFFR345F2LL"))
}