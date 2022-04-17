package Codewars

import org.junit.Assert
import org.junit.Test

object JavaUnicodeEncoder {
    fun decode(input:String?):String {
        val str = input ?: ""
        return str.split("\\u").filter{it.trim().length>0}.map {
            it.toInt(16).toChar()
        }.joinToString("")
    }

    fun encode(input:String?):String {
        val str = input ?: ""
        return str.map {
            "\\u" + it.toInt().toString(16).padStart(4,'0')
        }.joinToString("")
    }
}

class JavaUnicodeEncoderTest {
    @Test
    @Throws(Exception::class)
    fun decode() {
        Assert.assertEquals("hola", JavaUnicodeEncoder.decode("\\u0068\\u006f\\u006c\\u0061"))
    }
    @Test
    @Throws(Exception::class)
    fun encode() {
        Assert.assertEquals("\\u0068\\u006f\\u006c\\u0061", JavaUnicodeEncoder.encode("hola"))
    }
}

fun main(){
    println(JavaUnicodeEncoder.encode("hola"))
    println(JavaUnicodeEncoder.decode("\\u0068\\u006f\\u006c\\u0061"))
}