package leetcode.solution.n581

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import kotlin.test.assertEquals

enum class Solutions(private val solution: Solution) : Solution {
    SORT(SortSolution()), STACK(StackSolution());

    override fun findUnsortedSubarray(nums: IntArray): Int = solution.findUnsortedSubarray(nums)

}

internal class SolutionTest {

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test1(solution: Solution) {
        assertEquals(5, solution.findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test2(solution: Solution) {
        assertEquals(0, solution.findUnsortedSubarray(intArrayOf(1, 2, 3, 4)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test3(solution: Solution) {
        assertEquals(0, solution.findUnsortedSubarray(intArrayOf(1)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test4(solution: Solution) {
        assertEquals(10, solution.findUnsortedSubarray(intArrayOf(1, 9, 6, 5, 4, 7, 5, 2, 1, 3, 3, 17, 19)))
    }
}