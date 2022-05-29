package leetcode.solution.n1721

import leetcode.util.ListNode

/**
 * [1721. Swapping Nodes in a Linked List](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)
 */
class Solution {
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        val nullNode = ListNode(-1).also { it.next = head }
        val node1 = nullNode.next(k - 1)
        var node2: ListNode? = nullNode
        var current: ListNode? = nullNode.next(k + 1)
        while (current != null) {
            current = current.next
            node2 = node2?.next
        }
        if (node1 != node2) {
            swapLinks(node1, node2)
            swapLinks(node1?.next, node2?.next)
        }
        return nullNode.next
    }

    private fun swapLinks(node1: ListNode?, node2: ListNode?) {
        val temp = node1?.next
        node1?.next = node2?.next
        node2?.next = temp
    }

    private fun ListNode?.next(skip: Int): ListNode? {
        var listNode: ListNode? = this
        for (i in 0 until skip) {
            listNode = listNode?.next
        }
        return listNode
    }
}