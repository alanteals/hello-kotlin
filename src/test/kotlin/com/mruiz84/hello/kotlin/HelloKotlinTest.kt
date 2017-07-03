package com.mruiz84.hello.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class HelloKotlinTest {

    @Test fun f() {
        assertEquals("Hello, world!", getGreeting())
    }

    fun getGreeting(): String {
        val words = mutableListOf<String>()
        words.add("Hello,")
        words.add("world!")

        return words.joinToString(separator = " ")
    }

}