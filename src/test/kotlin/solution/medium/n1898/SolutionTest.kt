package solution.medium.n1898

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.maximumRemovals("abcacb", "ab", intArrayOf(3, 1, 0)))
    }

    @Test
    fun test2() {
        assertEquals(1, solution.maximumRemovals("abcbddddd", "abcd", intArrayOf(3, 2, 1, 4, 5, 6)))
    }

    @Test
    fun test3() {
        assertEquals(0, solution.maximumRemovals("abcab", "abc", intArrayOf(0, 1, 2, 3, 4)))
    }

    @Test
    fun test4() {
        assertEquals(7, solution.maximumRemovals("qobftgcueho", "obue", intArrayOf(5, 3, 0, 6, 4, 9, 10, 7, 2, 8)))
    }

}