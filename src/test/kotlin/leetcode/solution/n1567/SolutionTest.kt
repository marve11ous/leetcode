package leetcode.solution.n1567

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(4, solution.getMaxLen(intArrayOf(1, -2, -3, 4)))
    }

    @Test
    fun test2() {
        assertEquals(3, solution.getMaxLen(intArrayOf(0, 1, -2, -3, -4)))
    }

    @Test
    fun test3() {
        assertEquals(2, solution.getMaxLen(intArrayOf(-1, -2, -3, 0, 1)))
    }

    @Test
    fun test4() {
        assertEquals(2, solution.getMaxLen(intArrayOf(-1, -2, -3, 0)))
    }
}