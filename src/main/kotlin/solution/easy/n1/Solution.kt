package solution.easy.n1

/**
 * [1. Two Sum](https://leetcode.com/problems/two-sum/)
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { i, num ->
            val j = map[target - num]
            if (j != null) return intArrayOf(i, j)
            map[num] = i
        }
        return intArrayOf()
    }
}