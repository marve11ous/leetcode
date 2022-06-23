package leetcode.solution.n82

import leetcode.util.ListNode

/**
 * [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var result: ListNode? = null
        var prev: ListNode? = null
        var cur = head
        while (cur != null) {
            if (cur.`val` == cur.next?.`val`) {
                val v = cur.`val`
                while (cur != null && cur.`val` == v) cur = cur.next
                prev?.next = cur
            } else {
                if (result == null) result = cur
                prev?.next = cur
                prev = cur
                cur = cur.next
            }
        }
        return result
    }
}