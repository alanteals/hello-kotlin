package com.mruiz84.hello.kotlin

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

class RandomTest {

    @Test
    fun randomOrderInListTest() {

        val original = arrayListOf("Marcus", "Alberto T.", "Miguel", "Laura", "Alberto G.", "Nono", "José Antonio", "Félix", "Paola", "Fabiola", "Agus", "Isa", "José Lara", "José Manuel")
        val employees: MutableList<String> = original.toMutableList()

        val seed = System.nanoTime()
        Collections.shuffle(employees, Random(seed))

        print("original: ")
        println(original)
        print("random..: ")
        print(employees)

        assertThat(employees.size, `is`(original.size))
        assertThat(employees, not(original.toMutableList()))
    }
}