package leetcode.solution.n40

import java.util.*

/**
 * [40. Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)
 */
class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        candidates.sort()
        result.combinationSum2(0, LinkedList<Int>(), candidates, target)
        return result
    }

    private fun MutableList<List<Int>>.combinationSum2(
        i: Int,
        current: LinkedList<Int>,
        candidates: IntArray,
        target: Int
    ) {
        if (target == 0) {
            add(current.toList())
            return
        }
        for (j in i until candidates.size) {
            if ((j <= i || candidates[j] != candidates[j - 1]) && target >= candidates[j]) {
                current.addLast(candidates[j])
                combinationSum2(j + 1, current, candidates, target - candidates[j])
                current.removeLast()
            }
        }
    }
}