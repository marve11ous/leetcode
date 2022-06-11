package leetcode.solution.n1588

import kotlin.math.ceil

/**
 * [1588. Sum of All Odd Length Subarrays](https://leetcode.com/problems/sum-of-all-odd-length-subarrays/)
 */
class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var result = 0
        for (i in arr.indices) {
            result += ceil((i + 1).toDouble() * (arr.size - i) / 2).toInt() * arr[i]
        }
        return result
    }
}