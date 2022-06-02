package leetcode.solution.n122

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(7, solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    }

    @Test
    fun test2() {
        assertEquals(4, solution.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun test3() {
        assertEquals(0, solution.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

    @Test
    fun test4() {
        assertEquals(7, solution.maxProfit(intArrayOf(7, 1, 3, 5, 3, 6, 4)))
    }

    @Test
    fun test5() {
        assertEquals(2, solution.maxProfit(intArrayOf(2, 1, 2, 0, 1)))
    }
}