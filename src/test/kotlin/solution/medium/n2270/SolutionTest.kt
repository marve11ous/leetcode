package solution.medium.n2270

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(2, solution.waysToSplitArray(intArrayOf(10, 4, -8, 7)))
    }

    @Test
    fun test2() {
        assertEquals(2, solution.waysToSplitArray(intArrayOf(2, 3, 1, 0)))
    }

    @Test
    fun test3() {
        assertEquals(0, solution.waysToSplitArray(intArrayOf(2, 3, 1, 7)))
    }

    @Test
    fun test4() {
        assertEquals(0, solution.waysToSplitArray(intArrayOf(1, 3)))
    }

    @Test
    fun test5() {
        assertEquals(2, solution.waysToSplitArray(intArrayOf(1, 2, -3)))
    }

    @Test
    fun test6() {
        assertEquals(3, solution.waysToSplitArray(intArrayOf(0, -1, -2, -3)))
    }
}