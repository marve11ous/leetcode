package leetcode.solution.n2283

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertTrue(solution.digitCount("1210"))
    }

    @Test
    fun test2() {
        assertFalse(solution.digitCount("030"))
    }
}