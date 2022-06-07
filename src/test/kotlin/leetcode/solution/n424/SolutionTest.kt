package leetcode.solution.n424

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(4, solution.characterReplacement("ABAB", 2))
    }

    @Test
    fun test2() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1))
    }

    @Test
    fun test3() {
        assertEquals(4, solution.characterReplacement("ABBB", 2))
    }

    @Test
    fun test4() {
        assertEquals(5, solution.characterReplacement("ABBBA", 2))
    }

    @Test
    fun test5() {
        assertEquals(23, solution.characterReplacement("AZAZAZZAAZAAAZAZZAZZZAZZ", 10))
    }

    @Test
    fun test6() {
        assertEquals(5, solution.characterReplacement("AABBBA", 2))
    }

    @Test
    fun test7() {
        assertEquals(4, solution.characterReplacement("AAAA", 0))
    }
}