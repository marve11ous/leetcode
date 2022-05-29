package leetcode.solution.n1641

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(5, solution.countVowelStrings(1))
    }

    @Test
    fun test2() {
        assertEquals(15, solution.countVowelStrings(2))
    }

    @Test
    fun test3() {
        assertEquals(66045, solution.countVowelStrings(33))
    }
}