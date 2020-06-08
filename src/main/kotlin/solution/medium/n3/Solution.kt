package solution.medium.n3

class Solution {

    fun lengthOfLongestSubstring(s: String): Int {
        val tmp: MutableMap<Char, Int> = HashMap()
        var max = 0
        var i = 0
        for (j in s.indices) {
            if (tmp.containsKey(s[j])) {
                i = max(tmp[s[j]], i)
            }
            max = max(max, j - i + 1)
            tmp[s[j]] = j + 1
        }
        return max
    }

    private fun max(a: Int?, b: Int): Int = if (a != null && a > b) a else b

}