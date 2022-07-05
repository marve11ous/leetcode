package leetcode.solution.n128

import java.util.*

/**
 * [128. Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)
 */
class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = HashSet<Int>().apply { nums.forEach { add(it) } }
        var result = 0
        nums.forEach {
            if (!set.contains(it - 1)) {
                var length = 1
                var num = it
                while (set.contains(++num)) length++
                result = result.coerceAtLeast(length)
            }
        }
        return result
    }

}