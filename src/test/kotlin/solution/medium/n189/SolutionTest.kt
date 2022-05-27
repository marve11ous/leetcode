package solution.medium.n189

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

enum class Solutions(private val solution: Solution) : Solution {
    NEW_ARRAY(Solution1()), NO_SPACE(Solution2());

    override fun rotate(nums: IntArray, k: Int) {
        solution.rotate(nums, k)
    }
}

internal class SolutionTest {

    private fun Solution.test(expected: Iterable<Int>, nums: IntArray, k: Int) {
        rotate(nums, k)
        assertIterableEquals(expected, nums.asIterable())
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test1(solution: Solution) {
        solution.test(
            expected = listOf(5, 6, 7, 1, 2, 3, 4),
            nums = intArrayOf(1, 2, 3, 4, 5, 6, 7),
            k = 3
        )
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test2(solution: Solution) {
        solution.test(
            expected = listOf(3, 99, -1, -100),
            nums = intArrayOf(-1, -100, 3, 99),
            k = 2
        )
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test3(solution: Solution) {
        solution.test(
            expected = listOf(7, 3, 5, -1),
            nums = intArrayOf(3, 5, -1, 7),
            k = 1
        )
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test4(solution: Solution) {
        solution.test(
            expected = listOf(2, 1),
            nums = intArrayOf(1, 2),
            k = 3
        )
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test5(solution: Solution) {
        solution.test(
            expected = listOf(3, 1, 2),
            nums = intArrayOf(1, 2, 3),
            k = 4
        )
    }
}