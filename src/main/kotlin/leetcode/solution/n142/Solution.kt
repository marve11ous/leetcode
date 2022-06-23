package leetcode.solution.n142

import leetcode.util.ListNode

/**
 * [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)
 */
class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head?.next
        var fast = head?.next?.next
        while (fast != null) {
            if (slow == fast) {
                slow = head
                while (slow != fast) {
                    slow = slow?.next
                    fast = fast?.next
                }
                return slow
            }
            slow = slow?.next
            fast = fast.next?.next
        }
        return null
    }
}