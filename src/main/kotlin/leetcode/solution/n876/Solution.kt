package leetcode.solution.n876

import leetcode.util.ListNode

/**
 * [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var mid = head
        var current = head
        var shiftMid = false
        while (current != null) {
            current = current.next
            if (shiftMid) mid = mid?.next
            shiftMid = !shiftMid
        }
        return mid
    }
}