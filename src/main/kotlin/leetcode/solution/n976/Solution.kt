package leetcode.solution.n976

/**
 * [976. Largest Perimeter Triangle](https://leetcode.com/problems/largest-perimeter-triangle/)
 */
class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        nums.sort()
        for (i in nums.size - 1 downTo 2) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2]
            }
        }
        return 0
    }
}