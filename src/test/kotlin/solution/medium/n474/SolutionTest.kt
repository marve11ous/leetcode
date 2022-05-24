package solution.medium.n474

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(4, solution.findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), m = 5, n = 3))
    }
}