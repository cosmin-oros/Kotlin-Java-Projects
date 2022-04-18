package Codewars

import kotlin.test.assertEquals
import org.junit.Test

class Dinglemouse {
    private val info = linkedMapOf("hello" to "Hello.")

    fun setAge(age: Int) = apply { info["age"] = "I am $age." }
    fun setSex(sex: Char) = apply { info["sex"] = "I am ${if (sex == 'M') "male" else "female"}." }
    fun setName(name: String) = apply { info["name"] = "My name is $name." }

    fun hello() = info.values.joinToString(" ")
}

class ExampleTests {

    @Test
    fun testBob27Male() {
        val dm = Dinglemouse().setName("Bob").setAge(27).setSex('M')
        val expected = "Hello. My name is Bob. I am 27. I am male."
        assertEquals(expected, dm.hello())
    }

    @Test
    fun test27MaleBob() {
        val dm = Dinglemouse().setAge(27).setSex('M').setName("Bob")
        val expected = "Hello. I am 27. I am male. My name is Bob."
        assertEquals(expected, dm.hello())
    }

    @Test
    fun testAliceFemale() {
        val dm = Dinglemouse().setName("Alice").setSex('F')
        val expected = "Hello. My name is Alice. I am female."
        assertEquals(expected, dm.hello())
    }

    @Test
    fun testBatman() {
        val dm = Dinglemouse().setName("Batman")
        val expected = "Hello. My name is Batman."
        assertEquals(expected, dm.hello())
    }

}

fun main(){
    val dm = Dinglemouse().setAge(27).setSex('M').setName("Bob")
    println(dm.hello())
}