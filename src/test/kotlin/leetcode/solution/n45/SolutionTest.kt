package leetcode.solution.n45

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.jump(intArrayOf(2, 3, 1, 1, 4)))
    }

    @Test
    fun test2() {
        assertEquals(2, solution.jump(intArrayOf(2, 3, 0, 1, 4)))
    }

    @Test
    fun test3() {
        assertEquals(3, solution.jump(intArrayOf(1, 2, 1, 1, 1)))
    }
}