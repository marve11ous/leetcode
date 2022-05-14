package solution.medium.n1288

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.removeCoveredIntervals(arrayOf(intArrayOf(1, 4), intArrayOf(3, 6), intArrayOf(2, 8))))
    }

    @Test
    fun test2() {
        assertEquals(1, solution.removeCoveredIntervals(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))))
    }

    @Test
    fun test3() {
        assertEquals(
            2,
            solution.removeCoveredIntervals(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(2, 5),
                    intArrayOf(3, 5),
                    intArrayOf(1, 1)
                )
            )
        )
    }
}