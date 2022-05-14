package solution.medium.n743

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            2,
            solution.networkDelayTime(arrayOf(intArrayOf(2, 1, 1), intArrayOf(2, 3, 1), intArrayOf(3, 4, 1)), 4, 2)
        )
    }

    @Test
    fun test2() {
        assertEquals(1, solution.networkDelayTime(arrayOf(intArrayOf(1, 2, 1)), 2, 1))
    }

    @Test
    fun test3() {
        assertEquals(-1, solution.networkDelayTime(arrayOf(intArrayOf(1, 2, 1)), 2, 2))
    }

    @Test
    fun test4() {
        assertEquals(3, solution.networkDelayTime(arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 1, 3)), 2, 2))
    }

    @Test
    fun test5() {
        assertEquals(
            2,
            solution.networkDelayTime(arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 3, 2), intArrayOf(1, 3, 2)), 3, 1)
        )
    }
}