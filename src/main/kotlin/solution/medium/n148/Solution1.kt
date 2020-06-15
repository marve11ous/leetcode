package solution.medium.n148

import solution.util.ListNode

/**
 * 148. Sort List
 *
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
class Solution1 {
    fun sortList(head: ListNode?): ListNode? {
        return quickSort(head, null)
    }

    private fun quickSort(pivot: ListNode?, end: Int?): ListNode? {
        if (pivot?.next == null || pivot.`val` == end) {
            return pivot
        }
        var first = pivot
        var prev = pivot
        var current = pivot.next
        while (current != null) {
            if (current.`val` < pivot.`val`) {
                prev?.next = current.next
                current.next = first
                first = current
                current = pivot.next
            } else {
                prev = current
                current = current.next
            }
        }
        val newFirst = quickSort(first, pivot.`val`)
        pivot.next = quickSort(pivot.next, null)
        return newFirst
    }
}