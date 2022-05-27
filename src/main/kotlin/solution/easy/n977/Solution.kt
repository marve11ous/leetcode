package solution.easy.n977

/**
 * [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
 */
class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var l = 0
        var r = nums.size - 1
        var i = r
        while (l <= r) {
            val j = if (Math.abs(nums[l]) > nums[r]) l++ else r--
            result[i--] = nums[j].square()
        }
        return result
    }

    private fun Int.square() = this * this
}