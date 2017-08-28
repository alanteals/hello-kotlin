package com.mruiz84.hello.kotlin

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import kotlin.test.assertEquals

class DefiningFunctionsTest {

    var cut = DefiningFunctions.create()

    @Test
    fun `sum 2 integer numbers with standardSum`() {
        assertEquals(8, cut.standardSum(3, 5))
    }

    @Test
    fun `sum 2 integer numbers with `() {
        assertEquals(8, cut.expressionBodySum(3, 5))
    }

    @Test
    fun `print the sum for two operands`() {
        cut.printSum(3, 5)
    }

}