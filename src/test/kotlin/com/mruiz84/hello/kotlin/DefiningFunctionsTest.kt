package com.mruiz84.hello.kotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DefiningFunctionsTest {

    var cut = DefiningFunctions.create()

    @Test
    fun f() {
        assertEquals(8, cut.sum(3, 5))
    }
}