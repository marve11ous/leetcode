package leetcode.solution.n119

/**
 * [119. Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/)
 */
class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val result = IntArray(rowIndex + 1) { 1 }
        for (i in 2..rowIndex) {
            for (j in (i - 1) downTo 1) {
                result[j] += result[j - 1]
            }
        }
        return result.toList()
    }
}