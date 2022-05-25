package solution.hard.n354

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            3,
            solution.maxEnvelopes(arrayOf(intArrayOf(5, 4), intArrayOf(6, 4), intArrayOf(6, 7), intArrayOf(2, 3)))
        )
    }

    @Test
    fun test2() {
        assertEquals(1, solution.maxEnvelopes(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1))))
    }

    @Test
    fun test3() {
        assertEquals(1, solution.maxEnvelopes(arrayOf(intArrayOf(1, 1))))
    }

    @Test
    fun test4() {
        assertEquals(2, solution.maxEnvelopes(arrayOf(intArrayOf(1, 2), intArrayOf(2, 4))))
    }

    @Test
    fun test5() {
        assertEquals(
            2,
            solution.maxEnvelopes(arrayOf(intArrayOf(10, 8), intArrayOf(1, 12), intArrayOf(6, 15), intArrayOf(2, 18)))
        )
    }

    @Test
    fun test6() {
        assertEquals(
            4,
            solution.maxEnvelopes(
                arrayOf(
                    intArrayOf(4, 5),
                    intArrayOf(4, 6),
                    intArrayOf(6, 7),
                    intArrayOf(2, 3),
                    intArrayOf(1, 1)
                )
            )
        )
    }

    @Test
    fun test7() {
        assertEquals(
            7,
            solution.maxEnvelopes(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(3, 5),
                    intArrayOf(4, 5),
                    intArrayOf(5, 5),
                    intArrayOf(5, 6),
                    intArrayOf(6, 7),
                    intArrayOf(7, 8)
                )
            )
        )
    }
}