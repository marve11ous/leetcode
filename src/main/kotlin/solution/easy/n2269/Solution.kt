package solution.easy.n2269

/**
 * [2269. Find the K-Beauty of a Number](https://leetcode.com/problems/find-the-k-beauty-of-a-number/)
 */
class Solution {
    fun divisorSubstrings(num: Int, k: Int): Int {
        val numStr = num.toString()
        var result = 0
        for (i in 0 until numStr.length - k + 1) {
            val sub = numStr.substring(i, i + k).toInt()
            if (sub != 0 && num % sub == 0) result++
        }
        return result
    }
}