package solution.medium.n991

/**
 * [991. Broken Calculator](https://leetcode.com/problems/broken-calculator/)
 */
class Solution {
    fun brokenCalc(startValue: Int, target: Int): Int {
        var cnt = 0
        var current = target
        while (current > startValue) {
            if (current % 2 == 0) current /= 2
            else current++
            cnt++
        }
        return cnt + (startValue - current)
    }
}