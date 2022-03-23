package solution.easy.n796

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertTrue(solution.rotateString(s = "abcde", goal = "cdeab"))
    }

    @Test
    fun test2() {
        assertFalse(solution.rotateString(s = "abcde", goal = "abced"))
    }
}