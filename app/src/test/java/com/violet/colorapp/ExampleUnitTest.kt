package com.violet.colorapp

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    
    @Test
    fun testGreenShadesCount() {
        assertEquals("Should have exactly 10 green shades", 10, greenShades.size)
    }
    
    @Test
    fun testPurpleShadesCount() {
        assertEquals("Should have exactly 10 purple shades", 10, purpleShades.size)
    }
    
    @Test
    fun testShadeNamesNotEmpty() {
        greenShades.forEach { shade ->
            assertTrue("Shade name should not be empty", shade.name.isNotEmpty())
        }
        purpleShades.forEach { shade ->
            assertTrue("Shade name should not be empty", shade.name.isNotEmpty())
        }
    }
} 