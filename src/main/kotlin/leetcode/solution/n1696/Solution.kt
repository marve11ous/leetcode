package leetcode.solution.n1696

import java.util.Collections
import java.util.PriorityQueue

/**
 * [1696. Jump Game VI](https://leetcode.com/problems/jump-game-vi/)
 */
class Solution {
    fun maxResult(nums: IntArray, k: Int): Int {
        val dp = IntArray(nums.size) { nums[nums.size - it - 1] }
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        for (i in nums.indices) {
            if (pq.isNotEmpty()) dp[i] += pq.peek()
            pq.add(dp[i])
            if (pq.size > k) pq.remove(dp[i - k])
        }
        return dp.last()
    }
}