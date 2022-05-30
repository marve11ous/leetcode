package leetcode.solution.n918

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(3, solution.maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)))
    }

    @Test
    fun test2() {
        assertEquals(10, solution.maxSubarraySumCircular(intArrayOf(5, -3, 5)))
    }

    @Test
    fun test3() {
        assertEquals(-2, solution.maxSubarraySumCircular(intArrayOf(-3, -2, -3)))
    }

    @Test
    fun test4() {
        assertEquals(4, solution.maxSubarraySumCircular(intArrayOf(3, -1, 2, -1)))
    }
}