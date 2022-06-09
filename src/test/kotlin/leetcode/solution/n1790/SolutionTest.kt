package leetcode.solution.n1790

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertTrue(solution.areAlmostEqual("bank", "kanb"))
    }

    @Test
    fun test2() {
        assertFalse(solution.areAlmostEqual("attack", "defend"))
    }

    @Test
    fun test3() {
        assertTrue(solution.areAlmostEqual("kelb", "kelb"))
    }

    @Test
    fun test4() {
        assertFalse(solution.areAlmostEqual("bang", "bank"))
    }

    @Test
    fun test5() {
        assertFalse(solution.areAlmostEqual("bank", "kanr"))
    }
}