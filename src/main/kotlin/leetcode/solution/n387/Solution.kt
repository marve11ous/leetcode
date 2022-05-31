package leetcode.solution.n387

/**
 * [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)
 */
class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()
        s.forEach { map.compute(it) { _, v -> (v ?: 0) + 1 } }
        s.forEachIndexed { i, c -> if (map[c] == 1) return i }
        return -1
    }
}