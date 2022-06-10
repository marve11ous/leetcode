package leetcode.solution.n496

import java.util.*

/**
 * [496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)
 */
class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val map = HashMap<Int, Int>()
        val stack = LinkedList<Int>()
        stack.push(nums2[0])
        for (i in 1 until nums2.size) {
            while (stack.isNotEmpty() && stack.peek() < nums2[i]) {
                map[stack.pop()] = nums2[i]
            }
            stack.push(nums2[i])
        }
        return nums1.map { map[it] ?: -1 }.toIntArray()
    }
}