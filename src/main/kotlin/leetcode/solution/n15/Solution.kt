package leetcode.solution.n15

import java.util.*

/**
 * [15. 3Sum](https://leetcode.com/problems/3sum/)
 */
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = ArrayList<List<Int>>()
        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var j = i + 1
            var k = nums.size - 1
            while (j < k) {
                val sum = nums[j] + nums[k] + nums[i]
                when {
                    sum == 0 -> {
                        result.add(listOf(nums[i], nums[j], nums[k]))
                        do k-- while (j < k && nums[k] == nums[k + 1])
                    }
                    sum > 0 -> k--
                    else -> j++
                }
            }
        }
        return result
    }
}