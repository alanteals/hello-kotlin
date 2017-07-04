package com.mruiz84.hello.kotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class HelloKotlinTest {

    @Test
    fun `hello world test`() {
        assertEquals("Hello, world!", getGreeting())
    }

    fun getGreeting(): String {
        val words = mutableListOf<String>()
        words.add("Hello,")
        words.add("world!")

        return words.joinToString(separator = " ")
    }
}