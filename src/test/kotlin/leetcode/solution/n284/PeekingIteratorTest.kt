package leetcode.solution.n284

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class PeekingIteratorTest {

    @Test
    fun test() {
        val peekingIterator = PeekingIterator(listOf(1, 2, 3).iterator())
        assertTrue(peekingIterator.hasNext())
        assertEquals(1, peekingIterator.next())
        assertEquals(2, peekingIterator.peek())
        assertEquals(2, peekingIterator.next())
        assertEquals(3, peekingIterator.next())
        assertFalse(peekingIterator.hasNext())
    }
}