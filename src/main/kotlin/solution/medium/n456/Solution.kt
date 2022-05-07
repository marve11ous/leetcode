package solution.medium.n456

import java.util.LinkedList

/**
 * [456. 132 Pattern](https://leetcode.com/problems/132-pattern/)
 */
class Solution {
    fun find132pattern(nums: IntArray): Boolean {
        val stack = LinkedList<Int>()
        var k = Int.MIN_VALUE
        for (i in nums.indices.reversed()) {
            if (nums[i] < k) return true
            while (stack.isNotEmpty() && stack.peek() < nums[i]) k = stack.pop()
            stack.push(nums[i])
        }
        return false
    }
}