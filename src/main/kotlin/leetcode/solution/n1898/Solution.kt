package leetcode.solution.n1898

/**
 * [1898. Maximum Number of Removable Characters](https://leetcode.com/problems/maximum-number-of-removable-characters/)
 */
class Solution {
    fun maximumRemovals(s: String, p: String, removable: IntArray): Int {
        var l = 0
        var r = removable.size
        var result = 0
        while (l <= r) {
            val k = (l + r) / 2
            if (isSub(s, p, removable, k)) {
                result = k
                l = k + 1
            } else {
                r = k - 1
            }
        }
        return result
    }

    private fun isSub(s: String, p: String, removable: IntArray, k: Int): Boolean {
        var j = 0
        s.toCharArray()
            .apply { (0 until k).forEach { i -> this[removable[i]] = ' ' } }
            .forEach {
                if (p[j] == it) j++
                if (j == p.length) return true
            }
        return false
    }
}