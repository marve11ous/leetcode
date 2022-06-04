package leetcode.solution.n42

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(6, solution.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
    }

    @Test
    fun test2() {
        assertEquals(9, solution.trap(intArrayOf(4, 2, 0, 3, 2, 5)))
    }
}