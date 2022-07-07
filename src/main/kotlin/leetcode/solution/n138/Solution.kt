package leetcode.solution.n138

/**
 * [138. Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)
 */
class Solution {
    fun copyRandomList(node: Node?): Node? {
        if (node == null) return null
        var result: Node? = null
        var current = node
        var copy: Node? = null
        while (current != null) {
            val new = Node(current.`val`)
            new.next = current.next
            current.next = new
            if (result == null) result = new
            copy?.next = current
            copy = new
            current = new.next
        }
        current = node
        while (current != null) {
            copy = current.next
            copy?.random = current.random?.next
            current = copy?.next
        }
        current = node
        while (current != null) {
            copy = current.next
            current.next = current.next?.next
            current = current.next
            copy?.next = current?.next
        }
        return result
    }
}

class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}