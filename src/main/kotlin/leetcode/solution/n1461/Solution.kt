package leetcode.solution.n1461

/**
 * [1461. Check If a String Contains All Binary Codes of Size K](https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/)
 */
class Solution {
    fun hasAllCodes(s: String, k: Int): Boolean {
        val set = HashSet<String>()
        val allCodesCount = 1 shl k
        for (i in 0..s.length - k) {
            set.add(s.substring(i, i + k))
            if (set.size == allCodesCount) return true
        }
        return false
    }
}