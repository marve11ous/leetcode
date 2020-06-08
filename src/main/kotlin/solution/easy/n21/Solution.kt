package solution.easy.n21

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
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var n1 = l1
        var n2 = l2
        var result: ListNode? = null
        var current: ListNode? = null
        while (n1 != null || n2 != null) {
            if (n1 != null && n1.`val` < n2?.`val` ?: Int.MAX_VALUE) {
                current?.next = n1
                current = n1
                n1 = n1.next
            } else if (n2 != null) {
                current?.next = n2
                current = n2
                n2 = n2.next
            }
            if (result == null) {
                result = current
            }
        }
        return result
    }

}