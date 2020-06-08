package solution.easy.n35

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (end - start > 1) {
            val mid = start + (end - start) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> start = mid
                else -> end = mid
            }
        }
        return when {
            nums[end] < target -> end + 1
            nums[start] >= target -> start
            else -> end
        }
    }
}