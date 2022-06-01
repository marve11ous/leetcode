package leetcode.solution.n567

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"))
    }

    @Test
    fun test2() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"))
    }

    @Test
    fun test3() {
        assertTrue(solution.checkInclusion("oo", "eidboaoo"))
    }

    @Test
    fun test4() {
        assertTrue(solution.checkInclusion("abc", "abcdef"))
    }

    @Test
    fun test5() {
        assertFalse(solution.checkInclusion("abc", "ab"))
    }
}