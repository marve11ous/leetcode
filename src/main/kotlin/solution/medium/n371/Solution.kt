package solution.medium.n371

/**
 * [371. Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/)
 */
class Solution {
    fun getSum(a: Int, b: Int): Int = if (b == 0) a else getSum(a xor b, a and b shl 1)
}