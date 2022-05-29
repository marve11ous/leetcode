package leetcode.solution.n2283

/**
 * [2283. Check if Number Has Equal Digit Count and Digit Value](https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/)
 */
class Solution {
    fun digitCount(num: String): Boolean {
        val count = IntArray(10)
        num.forEach { c -> count[Character.getNumericValue(c)]++ }
        return num.indices.all { count[it] == Character.getNumericValue(num[it]) }
    }
}