package solution.medium.n1679

/**
 * [1679. Max Number of K-Sum Pairs](https://leetcode.com/problems/max-number-of-k-sum-pairs/)
 */
class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        var result = 0
        nums.forEach { num ->
            if (map.containsKey(k - num)) {
                map.compute(k - num) { _, cnt -> if (cnt == 1) null else cnt?.minus(1) }
                result++
            } else {
                map.compute(num) { _, cnt -> if (cnt == null) 1 else (cnt + 1) }
            }
        }
        return result
    }
}