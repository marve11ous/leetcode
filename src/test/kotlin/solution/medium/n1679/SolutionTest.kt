package solution.medium.n1679

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.maxOperations(intArrayOf(1, 2, 3, 4), 5))
    }

    @Test
    fun test2() {
        assertEquals(1, solution.maxOperations(intArrayOf(3, 1, 3, 4, 3), 6))
    }

    @Test
    fun test3() {
        assertEquals(0, solution.maxOperations(intArrayOf(6), 6))
    }

    @Test
    fun test4() {
        assertEquals(
            4,
            solution.maxOperations(intArrayOf(2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2), 3)
        )
    }
}