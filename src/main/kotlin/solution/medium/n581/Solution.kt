package solution.medium.n581

import java.util.*
import kotlin.math.max
import kotlin.math.min

/**
 * [581. Shortest Unsorted Continuous Subarray](https://leetcode.com/problems/shortest-unsorted-continuous-subarray/)
 */
interface Solution {
    fun findUnsortedSubarray(nums: IntArray): Int
}

class SortSolution : Solution {
    override fun findUnsortedSubarray(nums: IntArray): Int {
        val sorted = nums.copyOf().apply { sort() }
        val min = nums.indices.firstOrNull { nums[it] != sorted[it] } ?: 0
        val max = (nums.size - 1 downTo 0).firstOrNull { nums[it] != sorted[it] }?.plus(1) ?: 0
        return max - min
    }
}

class StackSolution : Solution {
    override fun findUnsortedSubarray(nums: IntArray): Int {
        val stack = LinkedList<Int>()
        var min = nums.size
        for (i in nums.indices) {
            while (stack.isNotEmpty() && nums[i] < nums[stack.peek()]) {
                min = min(min, stack.pop())
            }
            stack.push(i)
        }
        stack.clear()
        var result = 0
        for (i in nums.size - 1 downTo 0) {
            while (stack.isNotEmpty() && nums[i] > nums[stack.peek()]) {
                result = max(result, stack.pop() + 1 - min)
            }
            stack.push(i)
        }
        return result
    }
}