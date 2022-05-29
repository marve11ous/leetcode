package leetcode.solution.n456

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertFalse(solution.find132pattern(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun test2() {
        assertTrue(solution.find132pattern(intArrayOf(3, 1, 4, 2)))
    }

    @Test
    fun test3() {
        assertTrue(solution.find132pattern(intArrayOf(-1, 3, 2, 0)))
    }

}