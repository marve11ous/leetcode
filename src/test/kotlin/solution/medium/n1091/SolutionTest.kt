package solution.medium.n1091

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            2, solution.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0)
                )
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(
            4,
            solution.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0)
                )
            )
        )
    }

    @Test
    fun test3() {
        assertEquals(
            -1,
            solution.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0)
                )
            )
        )
    }

    @Test
    fun test4() {
        assertEquals(
            3,
            solution.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 1, 0)
                )
            )
        )
    }

    @Test
    fun test5() {
        assertEquals(
            14,
            solution.shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1, 1, 0, 0, 0),
                    intArrayOf(0, 1, 0, 1, 1, 0),
                    intArrayOf(0, 1, 1, 0, 1, 0),
                    intArrayOf(0, 0, 0, 1, 1, 0),
                    intArrayOf(1, 1, 1, 1, 1, 0),
                    intArrayOf(1, 1, 1, 1, 1, 0)
                )
            )
        )
    }
}