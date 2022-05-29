package leetcode.solution.n47

/**
 * [47. Permutations II](https://leetcode.com/problems/permutations-ii/)
 */
class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        permuteUnique(result, nums.size, listOf(), nums.toList().groupingBy { it }.eachCount())
        return result
    }

    private fun permuteUnique(result: ArrayList<List<Int>>, n: Int, current: List<Int>, counts: Map<Int, Int>) {
        if (current.size == n) result += current
        else counts.forEach { permuteUnique(result, n, current + it.key, counts.decrement(it.key)) }
    }

    private fun Map<Int, Int>.decrement(num: Int): Map<Int, Int> =
        toMutableMap().apply { compute(num) { _, v -> if (v != null && v > 1) (v - 1) else null } }
}