package leetcode.solution.n931

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            13, solution.minFallingPathSum(
                arrayOf(
                    intArrayOf(2, 1, 3),
                    intArrayOf(6, 5, 4),
                    intArrayOf(7, 8, 9)
                )
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(
            -59, solution.minFallingPathSum(
                arrayOf(
                    intArrayOf(-19, 57),
                    intArrayOf(-40, -5)
                )
            )
        )
    }

    @Test
    fun test3() {
        assertEquals(
            9, solution.minFallingPathSum(
                arrayOf(
                    intArrayOf(2, 1, 3, 6, 2),
                    intArrayOf(6, 5, 4, 4, 5),
                    intArrayOf(3, 2, 7, 8, 9),
                    intArrayOf(3, 1, 7, 2, 9),
                    intArrayOf(1, 2, 6, 8, 3)
                )
            )
        )
    }

    @Test
    fun test4() {
        assertEquals(11, solution.minFallingPathSum(arrayOf(intArrayOf(11))))
    }
}