package leetcode.solution.n206

import leetcode.util.ListNode

/**
 * [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}