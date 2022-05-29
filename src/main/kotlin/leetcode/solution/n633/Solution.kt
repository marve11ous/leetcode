package leetcode.solution.n633

class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        var a = 0L
        var tmp = 0L
        while (tmp <= c) {
            val b = c - tmp.toInt()
            if (binarySearch(0, b.toLong(), b)) {
                return true
            }
            tmp = ++a * a
        }
        return false
    }

    private fun binarySearch(s: Long, e: Long, n: Int): Boolean {
        if (s > e) {
            return false
        }
        val mid = s + (e - s) / 2
        val tmp = mid * mid
        if (tmp == n.toLong()) {
            return true
        }
        return if (tmp > n) binarySearch(s, mid - 1, n)
        else binarySearch(mid + 1, e, n)
    }
}