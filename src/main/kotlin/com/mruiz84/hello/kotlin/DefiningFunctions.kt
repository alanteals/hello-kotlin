package com.mruiz84.hello.kotlin

// visit https://kotlinlang.org/docs/reference/basic-syntax.html#defining-functions
class DefiningFunctions {

    companion object Factory {
        fun create(): DefiningFunctions = DefiningFunctions()
    }

    // Function having two Int parameters with Int return type:
    fun standardSum(a: Int, b: Int): Int {
        return a + b
    }

    // Function with an expression body and inferred return type:
    fun expressionBodySum(a: Int, b: Int) = a + b

    // Function returning no meaningful value: (Unit return type could be omitted)
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
}
