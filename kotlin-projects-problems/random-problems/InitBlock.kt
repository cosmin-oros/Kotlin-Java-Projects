import java.util.*

fun main(args: Array<String>) {
    val person1 = Person("joe", 25)
}

class Person(fName: String, personAge: Int) {
    private val firstName: String
    private var age: Int

    // initializer block
    init {
        firstName = fName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}