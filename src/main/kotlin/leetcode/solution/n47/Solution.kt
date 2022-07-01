package leetcode.solution.n47

import java.util.LinkedList

/**
 * [47. Permutations II](https://leetcode.com/problems/permutations-ii/)
 */
class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        val counts = IntArray(21)
        nums.forEach { counts[it + 10]++ }
        permuteUnique(result, nums.size, LinkedList(), counts)
        return result
    }

    private fun permuteUnique(result: ArrayList<List<Int>>, n: Int, current: LinkedList<Int>, counts: IntArray) {
        if (current.size == n) {
            result += ArrayList(current)
            return
        }
        for (i in counts.indices) {
            if (counts[i] > 0) {
                counts[i]--
                current.addLast(i - 10)
                permuteUnique(result, n, current, counts)
                current.removeLast()
                counts[i]++
            }
        }
    }
}