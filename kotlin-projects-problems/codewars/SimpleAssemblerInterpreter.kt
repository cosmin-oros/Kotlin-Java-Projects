package Codewars

import org.junit.Test
import kotlin.test.assertEquals

fun interpret(program: Array<String>) = AssembleInterpreter().interprete(program)

private class AssembleInterpreter {

    private val registers = mutableMapOf<String,Int>()
    private val commands = mutableListOf<String>()

    private var currentLine = 0

    @Synchronized
    fun interprete(program: Array<String>): Map<String, Int> {
        registers.clear()
        commands.clear()

        commands.addAll(program)

        while (currentLine < commands.size) {
            executeLine(commands[currentLine])
        }

        return registers
    }

    private fun executeLine(line: String) {
        val words = line.split(' ')

        val command = words[0]
        val variable = words[1]
        val value by lazy { defineValue(words[2]) }

        when (command) {
            "mov" -> mov(variable, value)
            "jnz" -> jnz(variable, value)
            "inc" -> inc(variable)
            "dec" -> dec(variable)
        }

        if (command != "jnz") currentLine++
    }


    private fun mov(variable: String, value: Int) {
        registers[variable] = value
    }

    private fun inc(variable: String) {
        registers[variable] = registers[variable]!! + 1
    }

    private fun dec(variable: String) {
        registers[variable] = registers[variable]!! - 1
    }

    private fun jnz(variable: String, lines: Int) {
        val variableValue = defineValue(variable)

        if (variableValue == 0) currentLine += 1
        else currentLine += lines
    }


    private fun defineValue(declaration: String): Int {
        return declaration.toIntOrNull() ?: registers[declaration]!!
    }

}

class SolutionTest {

    @Test
    fun simple1() {
        assertEquals(
            mapOf("a" to 1),
            interpret(arrayOf("mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"))
        )
    }

    @Test
    fun simple2() {
        assertEquals(
            mapOf("a" to 0, "b" to -20),
            interpret(arrayOf("mov a -10", "mov b a", "inc a", "dec b", "jnz a -2"))
        )
    }
}

fun main(){
    println(interpret(arrayOf("mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a")))
}