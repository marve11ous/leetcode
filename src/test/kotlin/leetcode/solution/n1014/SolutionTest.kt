package leetcode.solution.n1014

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(11, solution.maxScoreSightseeingPair(intArrayOf(8, 1, 5, 2, 6)))
    }

    @Test
    fun test2() {
        assertEquals(11, solution.maxScoreSightseeingPair(intArrayOf(6, 1, 5, 2, 8)))
    }

    @Test
    fun test3() {
        assertEquals(2, solution.maxScoreSightseeingPair(intArrayOf(1, 2)))
    }
}