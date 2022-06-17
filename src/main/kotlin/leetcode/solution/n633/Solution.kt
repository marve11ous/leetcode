package leetcode.solution.n633

/**
 * [633. Sum of Square Numbers](https://leetcode.com/problems/sum-of-square-numbers/)
 */
class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        var a = 0L
        while (a * a <= c) {
            val target = c - a * a
            var l = 0L
            var r = target
            while (l <= r) {
                val mid = l + (r - l) / 2
                if (mid * mid == target) return true
                if (mid * mid < target) l = mid + 1 else r = mid - 1
            }
            a++
        }
        return false
    }

}