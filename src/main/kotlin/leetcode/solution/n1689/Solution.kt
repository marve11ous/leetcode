package leetcode.solution.n1689

/**
 * [1689. Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/)
 */
class Solution {
    fun minPartitions(n: String): Int {
        var result = 0
        n.forEach { result = result.coerceAtLeast(Character.digit(it, 10)) }
        return result
    }
}