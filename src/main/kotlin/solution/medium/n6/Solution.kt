package solution.medium.n6

/**
 * [6. Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)
 */
class Solution {
    fun convert(s: String, numRows: Int): String {
        val zigzag = Array(numRows) { StringBuilder() }
        var i = 0
        loop@while (true) {
            for (j in 0 until numRows) {
                zigzag[j].append(s[i++])
                if (i == s.length) break@loop
            }
            for (j in numRows - 2 downTo 1) {
                zigzag[j].append(s[i++])
                if (i == s.length) break@loop
            }
        }
        return zigzag.reduce { acc, stringBuilder -> acc.append(stringBuilder) }.toString()
    }
}