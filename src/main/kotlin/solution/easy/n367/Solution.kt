package solution.easy.n367

import kotlin.math.min

class Solution {
    fun isPerfectSquare(x: Int): Boolean {
        if (x == 1) return true
        val xL = x.toLong()
        var left = 0L
        var right = min(x, 46341)
        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            val pow = mid * mid
            when {
                pow == xL -> return true
                pow > xL -> right--
                else -> left++
            }
        }
        return false
    }
}