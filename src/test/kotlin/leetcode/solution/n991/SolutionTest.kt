package leetcode.solution.n991

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.brokenCalc(startValue = 2, target = 3))
    }

    @Test
    fun test2() {
        assertEquals(2, solution.brokenCalc(startValue = 5, target = 8))
    }

    @Test
    fun test3() {
        assertEquals(3, solution.brokenCalc(startValue = 3, target = 10))
    }
}