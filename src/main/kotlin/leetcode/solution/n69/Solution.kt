package leetcode.solution.n69

import kotlin.math.min

class Solution {
    fun mySqrt(x: Int): Int {
        if (x <= 1) return x
        val xL = x.toLong()
        var left = 0L
        var right = min(x, 46341)
        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            val pow = mid * mid
            when {
                pow == xL -> return mid.toInt()
                pow > xL -> right--
                else -> left++
            }
        }
        return left.toInt()
    }
}