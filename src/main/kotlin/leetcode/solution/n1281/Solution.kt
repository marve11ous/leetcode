package leetcode.solution.n1281

/**
 * [1281. Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
 */
class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var product = 1
        var sum = 0
        var k = n
        while (k > 0) {
            val d = k % 10
            product *= d
            sum += d
            k /= 10
        }
        return product - sum
    }
}