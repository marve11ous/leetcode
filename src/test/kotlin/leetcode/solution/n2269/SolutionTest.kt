package leetcode.solution.n2269

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.divisorSubstrings(240, 2))
    }

    @Test
    fun test2() {
        assertEquals(2, solution.divisorSubstrings(430043, 2))
    }
}