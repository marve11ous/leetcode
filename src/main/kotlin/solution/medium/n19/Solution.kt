package solution.medium.n19

import solution.util.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var toRemove = head
        var current = head
        var k = 0
        while (current != null) {
            if (k > n) {
                toRemove = toRemove?.next
            } else {
                k++
            }
            current = current.next
        }
        if (toRemove?.next == null) {
            return null
        }
        if (k == n) {
            return head?.next
        }
        toRemove.next = toRemove.next?.next
        return head
    }
}