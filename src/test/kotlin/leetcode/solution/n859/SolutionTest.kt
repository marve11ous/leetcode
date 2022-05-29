package leetcode.solution.n859

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertTrue(solution.buddyStrings(s = "ab", goal = "ba"))
    }

    @Test
    fun test2() {
        assertFalse(solution.buddyStrings(s = "ab", goal = "ab"))
    }

    @Test
    fun test3() {
        assertTrue(solution.buddyStrings(s = "aa", goal = "aa"))
    }

    @Test
    fun test4() {
        assertFalse(solution.buddyStrings(s = "aabc", goal = "aa"))
    }

    @Test
    fun test5() {
        assertTrue(solution.buddyStrings(s = "acbd", goal = "adbc"))
    }

    @Test
    fun test6() {
        assertFalse(solution.buddyStrings(s = "abcd", goal = "badc"))
    }

    @Test
    fun test7() {
        assertFalse(solution.buddyStrings(s = "abac", goal = "abad"))
    }
}