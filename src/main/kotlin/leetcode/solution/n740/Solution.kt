package leetcode.solution.n740

import kotlin.math.max

/**
 * [740. Delete and Earn](https://leetcode.com/problems/delete-and-earn/)
 */
class Solution {
    fun deleteAndEarn(nums: IntArray): Int {
        val sum = HashMap<Int, Int>()
        var maxNum = 0
        nums.forEach {
            sum.compute(it) { _, v -> (v ?: 0) + it }
            if (it > maxNum) maxNum = it
        }

        var prev1 = 0
        var prev2 = 0
        for (num in 1..maxNum) {
            val max = max(prev2, prev1 + (sum[num] ?: 0))
            prev1 = prev2
            prev2 = max
        }

        return max(prev1, prev2)
    }

}