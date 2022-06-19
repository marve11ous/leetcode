package leetcode.solution.n841

import java.util.LinkedList

/**
 * [841. Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/)
 */
class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val queue = LinkedList<Int>()
        queue.offer(0)
        val visited = BooleanArray(rooms.size)
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val room = queue.poll()
                if (visited[room]) continue
                visited[room] = true
                rooms[room].forEach { queue.offer(it) }
            }
        }
        return visited.all { it }
    }

}