package leetcode.solution.n318

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(16, solution.maxProduct(arrayOf("abcw", "baz", "foo", "bar", "xtfn", "abcdef")))
    }

    @Test
    fun test2() {
        assertEquals(4, solution.maxProduct(arrayOf("a", "ab", "abc", "d", "cd", "bcd", "abcd")))
    }

    @Test
    fun test3() {
        assertEquals(0, solution.maxProduct(arrayOf("a", "aa", "aaa", "aaaa")))
    }
}