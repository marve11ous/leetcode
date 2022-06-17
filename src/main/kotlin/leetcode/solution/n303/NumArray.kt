package leetcode.solution.n303

/**
 * [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)
 */
class NumArray(nums: IntArray) {

    private val sums = IntArray(nums.size).apply {
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            this[i] = sum
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        var sum = sums[right]
        if (left > 0) sum -= sums[left - 1]
        return sum
    }

}