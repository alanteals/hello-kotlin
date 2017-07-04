package com.mruiz84.hello.kotlin

import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.util.*
import kotlin.test.assertNotEquals

class RandomTest {

    @Test
    fun `random order in a list`() {

        val original = arrayListOf("Marcus", "Alberto T.", "Miguel", "Laura", "Alberto G.", "Nono", "José Antonio", "Félix", "Paola", "Fabiola", "Agus", "Isa", "José Lara", "José Manuel")
        val employees: MutableList<String> = original.toMutableList()

        val seed = System.nanoTime()
        Collections.shuffle(employees, Random(seed))

        println(LocalDateTime.now())
        print("original: ")
        println(original)
        print("random..: ")
        print(employees)

        assertNotEquals(employees, original.toMutableList());
    }
}