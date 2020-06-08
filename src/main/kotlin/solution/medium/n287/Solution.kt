package solution.medium.n287

class Solution {
    fun findDuplicate(nums: IntArray): Int {
        val set = nums.toMutableSet()
        for (num in nums) {
            if (!set.remove(num)) {
                return num
            }
        }
        return 0
    }
}