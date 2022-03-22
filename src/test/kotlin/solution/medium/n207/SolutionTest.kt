package solution.medium.n207

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()
    private val solve =
        { numCourses: Int, prerequisites: Array<IntArray> -> solution.canFinish(numCourses, prerequisites) }

    private fun test(expected: Boolean, actual: Boolean) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        test(
            true,
            solve(
                7,
                arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(0, 3),
                    intArrayOf(0, 2),
                    intArrayOf(3, 2),
                    intArrayOf(2, 5),
                    intArrayOf(4, 5),
                    intArrayOf(5, 6),
                    intArrayOf(2, 4)
                )
            )
        )
        test(true, solve(4, arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))))
        test(false, solve(4, arrayOf(intArrayOf(0, 1), intArrayOf(3, 1), intArrayOf(1, 3), intArrayOf(3, 2))))
        test(true, solve(2, arrayOf(intArrayOf(1, 0))))
        test(false, solve(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))))
    }
}