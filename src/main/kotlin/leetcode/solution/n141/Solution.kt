package leetcode.solution.n141

import leetcode.util.ListNode

/**
 * [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
 */
class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow === fast) return true
        }
        return false
    }
}