package leetcode.solution.n120

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            11, solution.minimumTotal(
                listOf(
                    listOf(2),
                    listOf(3, 4),
                    listOf(6, 5, 7),
                    listOf(4, 1, 8, 3)
                )
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(
            -10, solution.minimumTotal(
                listOf(
                    listOf(-10)
                )
            )
        )
    }

    @Test
    fun test3() {
        assertEquals(
            -1, solution.minimumTotal(
                listOf(
                    listOf(-1),
                    listOf(2, 3),
                    listOf(1, -1, -3)
                )
            )
        )
    }
}