package leetcode.solution.n148

import leetcode.util.ListNode

/**
 * 148. Sort List
 *
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
class Solution2 {
    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        var current = head
        var size = 0
        while (current != null) {
            current = current.next
            size++
        }
        var half = head
        var i = 0
        while (i++ < size / 2 - 1) {
            half = half?.next
        }
        val halfHead = half?.next
        half?.next = null
        return merge(sortList(head), sortList(halfHead))
    }

    private fun merge(left: ListNode?, right: ListNode?): ListNode? {
        if (left == null) {
            return right
        }
        if (right == null) {
            return left
        }
        val head = if (left.`val` < right.`val`) left else right
        head.next = merge(head.next, if (head == left) right else left)
        return head
    }
}