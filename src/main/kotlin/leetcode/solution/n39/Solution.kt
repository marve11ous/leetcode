package leetcode.solution.n39

import java.util.LinkedList

/**
 * [39. Combination Sum](https://leetcode.com/problems/combination-sum/)
 */
class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        result.combinationSum(0, candidates, LinkedList(), target)
        return result
    }

    private fun ArrayList<List<Int>>.combinationSum(
        i: Int,
        candidates: IntArray,
        current: LinkedList<Int>,
        target: Int
    ) {
        if (target == 0) {
            add(ArrayList(current))
            return
        }
        if (candidates[i] <= target) {
            current.add(candidates[i])
            combinationSum(i, candidates, current, target - candidates[i])
            current.removeLast()
        }
        if (i + 1 < candidates.size) combinationSum(i + 1, candidates, current, target)
    }
}
