package leetcode.solution.n78

import java.util.LinkedList

/**
 * [78. Subsets](https://leetcode.com/problems/subsets/)
 */
class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        result.subsets(-1, nums, LinkedList())
        return result
    }

    private fun ArrayList<List<Int>>.subsets(i: Int, nums: IntArray, current: LinkedList<Int>) {
        add(ArrayList(current))
        for (j in i + 1 until nums.size) {
            current.addLast(nums[j])
            subsets(j, nums, current)
            current.removeLast()
        }
    }
}