package solution.medium.n740

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(6, solution.deleteAndEarn(intArrayOf(3, 4, 2)))
    }

    @Test
    fun test2() {
        assertEquals(9, solution.deleteAndEarn(intArrayOf(2, 2, 3, 3, 3, 4)))
    }

    @Test
    fun test3() {
        assertEquals(4, solution.deleteAndEarn(intArrayOf(1, 3)))
    }
}