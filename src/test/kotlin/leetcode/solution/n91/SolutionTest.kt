package leetcode.solution.n91

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.numDecodings("12"))
    }

    @Test
    fun test2() {
        assertEquals(3, solution.numDecodings("226"))
    }

    @Test
    fun test3() {
        assertEquals(0, solution.numDecodings("06"))
    }

    @Test
    fun test4() {
        assertEquals(10, solution.numDecodings("121423"))
    }

    @Test
    fun test5() {
        assertEquals(0, solution.numDecodings("100"))
    }
}