package solution.medium.n189

/**
 * [189. Rotate Array](https://leetcode.com/problems/rotate-array/)
 */
interface Solution {
    fun rotate(nums: IntArray, k: Int)
}

class Solution1 : Solution {
    override fun rotate(nums: IntArray, k: Int) {
        val offset = nums.size - k % nums.size
        IntArray(nums.size) { nums[(it + offset) % nums.size] }.forEachIndexed { i, num -> nums[i] = num }
    }
}

class Solution2 : Solution {

    override fun rotate(nums: IntArray, k: Int) {
        val offset = k % nums.size
        rotate(nums, nums.indices)
        rotate(nums, 0 until offset)
        rotate(nums, offset until nums.size)
    }

    private fun rotate(nums: IntArray, range: IntRange) {
        var l = range.first
        var r = range.last
        while (l < r) {
            val temp = nums[l]
            nums[l++] = nums[r]
            nums[r--] = temp
        }
    }

}