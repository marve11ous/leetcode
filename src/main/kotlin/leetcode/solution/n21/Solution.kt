package leetcode.solution.n21

import leetcode.util.ListNode

/**
 * [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2
        var current: ListNode? = null
        var head: ListNode? = null
        while (node1 != null || node2 != null) {
            val next: ListNode?
            if (node1?.`val` != null && (node2?.`val` ?: Int.MAX_VALUE) > node1.`val`) {
                next = node1
                node1 = node1.next
            } else {
                next = node2
                node2 = node2?.next
            }
            current?.next = next
            current = next
            if (head == null) head = next
        }
        return head
    }

}