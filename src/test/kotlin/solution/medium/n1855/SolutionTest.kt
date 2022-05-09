package solution.medium.n1855

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.maxDistance(intArrayOf(55, 30, 5, 4, 2), intArrayOf(100, 20, 10, 10, 5)))
    }

    @Test
    fun test2() {
        assertEquals(1, solution.maxDistance(intArrayOf(2, 2, 2), intArrayOf(10, 10, 1)))
    }

    @Test
    fun test3() {
        assertEquals(2, solution.maxDistance(intArrayOf(30, 29, 19, 5), intArrayOf(25, 25, 25, 25, 25)))
    }
}