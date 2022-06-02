package leetcode.solution.n203

import leetcode.util.ListNode

/**
 * [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)
 */
class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var current = head
        var result: ListNode? = null
        var prev: ListNode? = null
        while (current != null) {
            while (current?.`val` == `val`) {
                prev?.next = current.next
                current = current.next
            }
            prev = current
            current = current?.next
            if (result == null) result = prev
        }
        return result
    }
}