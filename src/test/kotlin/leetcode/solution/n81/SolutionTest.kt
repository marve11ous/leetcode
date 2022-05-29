package leetcode.solution.n81

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {
    val solution = Solution()

    @Test
    fun test1() {
        assertTrue(solution.search(nums = intArrayOf(2, 5, 6, 0, 0, 1, 2), target = 0))
    }

    @Test
    fun test2() {
        assertFalse(solution.search(nums = intArrayOf(2, 5, 6, 0, 0, 1, 2), target = 3))
    }

    @Test
    fun test3() {
        assertTrue(solution.search(nums = intArrayOf(1, 0, 1, 1, 1), target = 0))
    }

}