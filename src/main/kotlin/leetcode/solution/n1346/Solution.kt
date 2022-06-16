package leetcode.solution.n1346

/**
 * [1346. Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/)
 */
class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val set = HashSet<Int>()
        arr.forEach { num ->
            if (set.contains(num * 2) || num % 2 == 0 && set.contains(num / 2)) return true
            set.add(num)
        }
        return false
    }
}