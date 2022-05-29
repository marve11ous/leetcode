package leetcode.solution.n118

/**
 * [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)
 */
class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        var prevRow = IntArray(0)
        for (i in 1..numRows) {
            val row = IntArray(i) { 1 }
            for (j in 1 until row.size - 1) {
                row[j] = prevRow[j - 1] + prevRow[j]
            }
            prevRow = row
            result.add(row.toList())
        }
        return result
    }
}