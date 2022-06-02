package leetcode.solution.n83

import leetcode.util.ListNode

/**
 * [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current != null) {
            while (current.`val` == current.next?.`val`) {
                current.next = current.next?.next
            }
            current = current.next
        }
        return head
    }
}