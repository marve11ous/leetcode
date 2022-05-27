package solution.easy.n977

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertIterableEquals(
            listOf(0, 1, 9, 16, 100),
            solution.sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).asIterable()
        )
    }

    @Test
    fun test2() {
        assertIterableEquals(
            listOf(4, 9, 9, 49, 121),
            solution.sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).asIterable()
        )
    }

    @Test
    fun test3() {
        assertIterableEquals(
            listOf(1, 4, 9, 49, 121),
            solution.sortedSquares(intArrayOf(-7, -1, 2, 3, 11)).asIterable()
        )
    }

    @Test
    fun test4() {
        assertIterableEquals(
            listOf(1),
            solution.sortedSquares(intArrayOf(-1)).asIterable()
        )
    }

    @Test
    fun test5() {
        assertIterableEquals(
            listOf(1, 1),
            solution.sortedSquares(intArrayOf(-1, 1)).asIterable()
        )
    }

    @Test
    fun test6() {
        assertIterableEquals(
            listOf(1, 1, 4),
            solution.sortedSquares(intArrayOf(-1, 1, 2)).asIterable()
        )
    }

    @Test
    fun test7() {
        assertIterableEquals(
            listOf(1, 4, 9, 25),
            solution.sortedSquares(intArrayOf(-5, -3, -2, -1)).asIterable()
        )
    }
}