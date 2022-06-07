package leetcode.solution.n480

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertIterableEquals(
            listOf(1.0, -1.0, -1.0, 3.0, 5.0, 6.0),
            solution.medianSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3).asIterable()
        )
    }

    @Test
    fun test2() {
        assertIterableEquals(
            listOf(2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0),
            solution.medianSlidingWindow(intArrayOf(1, 2, 3, 4, 2, 3, 1, 4, 2), 3).asIterable()
        )
    }

    @Test
    fun test3() {
        assertIterableEquals(
            listOf(0.0, 1.0, 1.0, 4.0, 5.50000),
            solution.medianSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 4).asIterable()
        )
    }
}