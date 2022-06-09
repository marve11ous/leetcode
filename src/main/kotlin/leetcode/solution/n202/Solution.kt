package leetcode.solution.n202

/**
 * [202. Happy Number](https://leetcode.com/problems/happy-number/)
 */
class Solution {

    fun isHappy(n: Int): Boolean {
        if (n == 1) return true
        var slow = n
        var fast = n.next()
        while (slow != fast) {
            slow = slow.next()
            fast = fast.next().next()
            if (slow == 1 || fast == 1) return true
        }
        return false
    }

    private fun Int.next(): Int {
        var k = this
        var next = 0
        while (k > 0) {
            val d = k % 10
            next += d * d
            k /= 10
        }
        return next
    }
}