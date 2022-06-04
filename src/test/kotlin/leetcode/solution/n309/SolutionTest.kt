package leetcode.solution.n309

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(3, solution.maxProfit(intArrayOf(1, 2, 3, 0, 2)))
    }

    @Test
    fun test2() {
        assertEquals(0, solution.maxProfit(intArrayOf(1)))
    }

    @Test
    fun test3() {
        assertEquals(6, solution.maxProfit(intArrayOf(6, 1, 3, 2, 4, 7)))
    }
}