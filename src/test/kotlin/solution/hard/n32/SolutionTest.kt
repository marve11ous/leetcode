package solution.hard.n32

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.longestValidParentheses("(()"))
    }

    @Test
    fun test2() {
        assertEquals(4, solution.longestValidParentheses(")()())"))
    }

    @Test
    fun test3() {
        assertEquals(4, solution.longestValidParentheses("())(((())"))
    }

    @Test
    fun test4() {
        assertEquals(0, solution.longestValidParentheses(""))
    }
}