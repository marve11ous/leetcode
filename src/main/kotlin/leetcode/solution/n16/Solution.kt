package leetcode.solution.n16

import kotlin.math.abs

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var closest = 0
        var diff = Int.MAX_VALUE
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    val sum = nums[i] + nums[j] + nums[k]
                    val curDiff = abs(sum - target)
                    if (curDiff == 0) {
                        return sum
                    }
                    if (curDiff < diff) {
                        closest = sum
                        diff = curDiff
                    }
                }
            }
        }
        return closest
    }
}