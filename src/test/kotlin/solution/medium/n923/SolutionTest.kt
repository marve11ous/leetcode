package solution.medium.n923

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(20, solution.threeSumMulti(arr = intArrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5), target = 8))
    }

    @Test
    fun test2() {
        assertEquals(12, solution.threeSumMulti(arr = intArrayOf(1, 1, 2, 2, 2, 2), target = 5))
    }
}