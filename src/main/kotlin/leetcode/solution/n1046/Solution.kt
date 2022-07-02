package leetcode.solution.n1046

import java.util.*
import kotlin.math.abs

/**
 * [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)
 */
interface Solution {
    fun lastStoneWeight(stones: IntArray): Int
}

class SolutionHeap : Solution {
    override fun lastStoneWeight(stones: IntArray): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder()).apply { stones.forEach { add(it) } }
        while (pq.size > 1) {
            val smash = pq.poll() - pq.poll()
            if (smash != 0) pq.add(abs(smash))
        }
        return if (pq.isEmpty()) 0 else pq.poll()
    }
}

class SolutionTreeMap : Solution {
    override fun lastStoneWeight(stones: IntArray): Int {
        val map = TreeMap<Int, Int>()
        for (stone in stones) {
            map[stone] = (map[stone] ?: 0) + 1
        }

        while (map.isNotEmpty()) {
            var lastEntry = map.lastEntry()
            if (lastEntry.value % 2 > 0) {
                val stone = lastEntry.key
                map.remove(lastEntry.key)
                if (map.isNotEmpty()) {
                    lastEntry = map.lastEntry()
                    val newCount = (map[lastEntry.key] ?: 0) - 1
                    if (newCount > 0) map[lastEntry.key] = newCount else map.remove(lastEntry.key)
                    map[stone - lastEntry.key] = (map[stone - lastEntry.key] ?: 0) + 1
                } else return stone
            } else map.remove(lastEntry.key)
        }
        return if (map.isEmpty()) 0 else map.lastKey()
    }
}

class SolutionSort : Solution {
    override fun lastStoneWeight(stones: IntArray): Int {
        var c = stones.size - 1
        while (c > 0) {
            Arrays.sort(stones)
            if (stones[c] == stones[c - 1]) {
                stones[c - 1] = Int.MAX_VALUE
                stones[c] = Int.MAX_VALUE
                c -= 2
            } else {
                stones[c - 1] = stones[c] - stones[c - 1]
                stones[c] = Int.MAX_VALUE
                c--
            }
        }
        return if (c < 0) 0 else stones[0]
    }
}