package leetcode.solution.n905

/**
 * [905. Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)
 */
class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var i = 0
        nums.filter { it % 2 == 0 }.forEach { result[i++] = it }
        nums.filter { it % 2 != 0 }.forEach { result[i++] = it }
        return result
    }
}