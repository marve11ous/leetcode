package leetcode.solution.n19

import leetcode.util.ListNode

/**
 * [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var toRemove = head
        var current = head
        var k = 0
        while (current != null) {
            if (k > n) toRemove = toRemove?.next else k++
            current = current.next
        }
        return when {
            toRemove?.next == null -> null
            k == n -> head?.next
            else -> {
                toRemove.next = toRemove.next?.next
                head
            }
        }
    }
}