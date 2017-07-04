package com.mruiz84.hello.kotlin

class DefiningFunctions {

    companion object Factory {
        fun create(): DefiningFunctions = DefiningFunctions()
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}
