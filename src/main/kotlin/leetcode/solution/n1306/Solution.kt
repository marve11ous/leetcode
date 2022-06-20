package leetcode.solution.n1306

import java.util.*

/**
 * [1306. Jump Game III](https://leetcode.com/problems/jump-game-iii/)
 */
class Solution {
    fun canReach(arr: IntArray, start: Int): Boolean {
        val queue = LinkedList<Int>()
        queue.add(start)
        val visited = BooleanArray(arr.size)
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val i = queue.poll()
                if (visited[i]) continue
                if (arr[i] == 0) return true
                visited[i] = true
                if (i + arr[i] < arr.size) queue.offer(i + arr[i])
                if (i - arr[i] >= 0) queue.offer(i - arr[i])
            }
        }
        return false
    }
}