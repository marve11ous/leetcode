package leetcode.solution.n90

import java.util.*

/**
 * [90. Subsets II](https://leetcode.com/problems/subsets-ii/)
 */
class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val result = HashSet<List<Int>>()
        result.subsets(-1, nums, LinkedList())
        return result.toList()
    }

    private fun HashSet<List<Int>>.subsets(i: Int, nums: IntArray, current: LinkedList<Int>) {
        add(current.sorted())
        for (j in i + 1 until nums.size) {
            current.addLast(nums[j])
            subsets(j, nums, current)
            current.removeLast()
        }
    }
}