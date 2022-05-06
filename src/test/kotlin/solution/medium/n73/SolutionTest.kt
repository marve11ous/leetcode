package solution.medium.n73

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author AShkabara
 */
internal class SolutionTest {
    private val solution = Solution()

    private fun test(matrix: Array<IntArray>, expected: Array<IntArray>) {
        solution.setZeroes(matrix)
        matrix.forEachIndexed { i, row -> row.forEachIndexed { j, value -> assertEquals(expected[i][j], value) } }
    }

    @Test
    fun test1() {
        test(
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
            ),
            arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0),
                intArrayOf(1, 0, 1)
            )
        )
    }

    @Test
    fun test2() {
        test(
            arrayOf(
                intArrayOf(0, 1, 2, 0),
                intArrayOf(3, 4, 5, 2),
                intArrayOf(1, 3, 1, 5)
            ),
            arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 4, 5, 0),
                intArrayOf(0, 3, 1, 0)
            )
        )
    }

    @Test
    fun test3() {
        test(
            arrayOf(intArrayOf(1, 0)),
            arrayOf(intArrayOf(0, 0))
        )
    }

    @Test
    fun test4() {
        test(
            arrayOf(
                intArrayOf(3, 5, 5, 6, 9, 1, 4, 5, 0, 5),
                intArrayOf(2, 7, 9, 5, 9, 5, 4, 9, 6, 8),
                intArrayOf(6, 0, 7, 8, 1, 0, 1, 6, 8, 1),
                intArrayOf(7, 2, 6, 5, 8, 5, 6, 5, 0, 6),
                intArrayOf(2, 3, 3, 1, 0, 4, 6, 5, 3, 5),
                intArrayOf(5, 9, 7, 3, 8, 8, 5, 1, 4, 3),
                intArrayOf(2, 4, 7, 9, 9, 8, 4, 7, 3, 7),
                intArrayOf(3, 5, 2, 8, 8, 2, 2, 4, 9, 8)
            ),
            arrayOf(
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                intArrayOf(2, 0, 9, 5, 0, 0, 4, 9, 0, 8),
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                intArrayOf(5, 0, 7, 3, 0, 0, 5, 1, 0, 3),
                intArrayOf(2, 0, 7, 9, 0, 0, 4, 7, 0, 7),
                intArrayOf(3, 0, 2, 8, 0, 0, 2, 4, 0, 8)
            )
        )
    }
}

