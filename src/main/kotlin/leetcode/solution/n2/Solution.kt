package leetcode.solution.n2

import leetcode.util.ListNode

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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val res = ListNode(0)
        rec(l1, l2, res)
        return res
    }

    private fun rec(l1: ListNode?, l2: ListNode?, current: ListNode, ex: Int = 0) {
        val value = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + ex
        current.`val` = value % 10
        val newEx = value / 10
        if (l1?.next == null && l2?.next == null && newEx == 0) {
            return
        }
        val next = ListNode(0)
        current.next = next
        return rec(l1?.next, l2?.next, next, newEx)
    }
}