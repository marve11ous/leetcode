package leetcode.solution.n367

/**
 * [367. Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)
 */
class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var l = 1
        var r = num
        while (l < r) {
            val mid = l + (r - l) / 2
            if (mid * mid.toLong() < num) l = mid + 1 else r = mid
        }
        return l * l == num
    }
}