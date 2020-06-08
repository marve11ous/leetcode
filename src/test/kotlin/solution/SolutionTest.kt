package solution

import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {

    private val solution = Solution()
    private val solve = { nums: IntArray -> solution.minimumAbsDifference(nums) }

    private fun test(expected: List<List<Int>>, actual: List<List<Int>>) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        test(
            listOf(listOf(1, 2), listOf(2, 3), listOf(3, 4)),
            solve(intArrayOf(4, 2, 1, 3))
        )
        test(
            listOf(listOf(1, 3)),
            solve(intArrayOf(1, 3, 6, 10, 15))
        )
        test(
            listOf(listOf(-14, -10), listOf(19, 23), listOf(23, 27)),
            solve(intArrayOf(3, 8, -10, 23, 19, -4, -14, 27))
        )
    }

}