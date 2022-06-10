package leetcode.solution.n1020

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            3,
            solution.numEnclaves(
                arrayOf(
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(1, 0, 1, 0),
                    intArrayOf(0, 1, 1, 0),
                    intArrayOf(0, 0, 0, 0)
                )
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(
            0,
            solution.numEnclaves(
                arrayOf(
                    intArrayOf(0, 1, 1, 0),
                    intArrayOf(0, 0, 1, 0),
                    intArrayOf(0, 0, 1, 0),
                    intArrayOf(0, 0, 0, 0)
                )
            )
        )
    }

    @Test
    fun test3() {
        assertEquals(
            27,
            solution.numEnclaves(
                arrayOf(
                    intArrayOf(0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1),
                    intArrayOf(1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1),
                    intArrayOf(1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0),
                    intArrayOf(1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1),
                    intArrayOf(1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0),
                    intArrayOf(1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1),
                    intArrayOf(1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0)
                )
            )
        )
    }

}