package leetcode.solution.n77

/**
 * [77. Combinations](https://leetcode.com/problems/combinations/)
 */
class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        return ArrayList<List<Int>>().apply { backtrack(IntArray(k), n, k, 0, 1) }
    }

    private fun ArrayList<List<Int>>.backtrack(result: IntArray, n: Int, k: Int, current: Int, min: Int) {
        if (current == k) {
            add(result.toList())
            return
        }
        for (j in min..n) {
            result[current] = j
            backtrack(result, n, k, current + 1, j + 1)
        }
    }
}