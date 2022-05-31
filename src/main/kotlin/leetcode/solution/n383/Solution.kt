package leetcode.solution.n383

/**
 * [383. Ransom Note](https://leetcode.com/problems/ransom-note/)
 */
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineMap = magazine.countChars()
        ransomNote.countChars().forEach { (c, cnt) ->
            if ((magazineMap[c] ?: 0) < cnt) return false
        }
        return true
    }

    private fun String.countChars(): Map<Char, Int> {
        val map = HashMap<Char, Int>()
        forEach { map.compute(it) { _, v -> (v ?: 0) + 1 } }
        return map
    }
}