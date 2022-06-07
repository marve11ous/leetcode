package leetcode.solution.n480

import java.util.*

/**
 * [480. Sliding Window Median](https://leetcode.com/problems/sliding-window-median/)
 */
class Solution {
    fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
        val less = PriorityQueue<Int>(Collections.reverseOrder())
        val more = PriorityQueue<Int>()
        for (i in 0 until k) {
            less.add(nums[i])
        }

        val result = DoubleArray(nums.size - k + 1)
        for (i in result.indices) {
            balance(less, more)
            result[i] = if (k % 2 == 0) (less.peek().toDouble() + more.peek()) / 2 else more.peek().toDouble()
            if (nums[i] < result[i]) less.remove(nums[i]) else more.remove(nums[i])
            if (i + k < nums.size) {
                if (nums[i + k] < result[i]) less.add(nums[i + k]) else more.add(nums[i + k])
            }
        }
        return result
    }

    private fun balance(less: PriorityQueue<Int>, more: PriorityQueue<Int>) {
        while (less.size > more.size) {
            more.add(less.poll())
        }
        while (less.size + 1 < more.size) {
            less.add(more.poll())
        }
    }
}