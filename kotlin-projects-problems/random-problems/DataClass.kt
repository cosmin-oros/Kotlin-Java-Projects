data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val cosmin = User("Cosmin", 19)
    println("name = ${cosmin.name}")
    println("age = ${cosmin.age}")
}