package Codewars

//import org.junit.Test
//import kotlin.test.DefaultAsserter.assertEquals

fun incrementString(str: String): String {
    val (letters, numbers) = separateStringAndFinalNumbers(str)
    val increasedNumbers = increaseNumbers(numbers)
    return letters + increasedNumbers
}

private fun increaseNumbers(numbers: String): String {
    return when (numbers) {
        "" -> "1"
        else -> (numbers.toInt() + 1).toString().padStart(numbers.length, '0')
    }
}

fun separateStringAndFinalNumbers(str: String): Pair<String, String> {
    val lastNonNumericChar = str.lastOrNull() { it.isLetter() }
    val highestNonNumericIndex = str.indexOfLast { it == lastNonNumericChar }
    val letters = str.slice(0..highestNonNumericIndex)
    val finalNumbers = str.slice(highestNonNumericIndex + 1..str.lastIndex)
    return Pair(
        letters,
        finalNumbers
    )
}

//class TestExample {
//    @Test
//    fun fixedTests() {
//        assertEquals(incrementString("foobar000"), "foobar001")
//        assertEquals(incrementString("foobar999"), "foobar1000")
//        assertEquals(incrementString("foobar00999"), "foobar01000")
//        assertEquals(incrementString("foo"), "foo1")
//        assertEquals(incrementString("foobar001"), "foobar002")
//        assertEquals(incrementString("foobar1"), "foobar2")
//        assertEquals(incrementString("1"), "2")
//        assertEquals(incrementString(""), "1")
//        assertEquals(incrementString("009"), "010")
//    }
//}

fun main(){
    println(incrementString("foobar000"))
}