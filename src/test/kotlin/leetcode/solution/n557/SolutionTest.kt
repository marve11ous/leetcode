package leetcode.solution.n557

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"))
    }

    @Test
    fun test2() {
        assertEquals("doG gniD", solution.reverseWords("God Ding"))
    }
}