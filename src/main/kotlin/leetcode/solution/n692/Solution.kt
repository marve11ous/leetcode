package leetcode.solution.n692

import java.util.*

/**
 * [692. Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words/)
 */
class Solution {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = HashMap<String, Int>()
        words.forEach { map.compute(it) { _, v -> (v ?: 0) + 1 } }
        val pq = PriorityQueue(Comparator<Pair<String, Int>> { o1, o2 -> o2.second - o1.second }
            .thenComparator { o1, o2 -> o1.first.compareTo(o2.first) })
        map.forEach { (word, count) -> pq.add(word to count) }
        return ArrayList<String>().apply { repeat(k) { add(pq.poll().first) } }
    }
}