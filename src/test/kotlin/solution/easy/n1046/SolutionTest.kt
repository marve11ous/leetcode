package solution.easy.n1046

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

enum class Solutions(private val solution: Solution) : Solution {
    TREEMAP(SolutionTreeMap()), SORT(SolutionSort());

    override fun lastStoneWeight(stones: IntArray): Int = solution.lastStoneWeight(stones)
}

internal class SolutionTest {

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test1(solution: Solution) {
        assertEquals(1, solution.lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test2(solution: Solution) {
        assertEquals(0, solution.lastStoneWeight(intArrayOf(2, 2)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test3(solution: Solution) {
        assertEquals(3, solution.lastStoneWeight(intArrayOf(2, 5)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test4(solution: Solution) {
        assertEquals(0, solution.lastStoneWeight(intArrayOf()))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test5(solution: Solution) {
        assertEquals(2, solution.lastStoneWeight(intArrayOf(2)))
    }
}