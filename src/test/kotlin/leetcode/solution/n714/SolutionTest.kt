package leetcode.solution.n714

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(8, solution.maxProfit(intArrayOf(1, 3, 2, 8, 4, 9), 2))
    }

    @Test
    fun test2() {
        assertEquals(6, solution.maxProfit(intArrayOf(1, 3, 7, 5, 10, 3), 3))
    }

    @Test
    fun test3() {
        assertEquals(11, solution.maxProfit(intArrayOf(1, 3, 2, 8, 4, 9, 1, 3, 6, 5, 4, 1, 2), 2))
    }

    @Test
    fun test4() {
        assertEquals(8, solution.maxProfit(intArrayOf(1, 3, 7, 5, 10, 3, 5, 6, 8, 7), 3))
    }

    @Test
    fun test5() {
        assertEquals(4, solution.maxProfit(intArrayOf(4, 5, 2, 4, 3, 3, 1, 2, 5, 4), 1))
    }
}