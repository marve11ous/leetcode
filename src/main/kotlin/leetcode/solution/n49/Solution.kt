package leetcode.solution.n49

/**
 * [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)
 */
class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = HashMap<String, ArrayList<String>>()
        strs.forEach { result.computeIfAbsent(it.getKey()) { ArrayList() }.add(it) }
        return result.values.toList()
    }

    private fun String.getKey(): String = String(toCharArray().apply { sort() })
}