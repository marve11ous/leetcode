package solution.medium.n1641

/**
 * [1641. Count Sorted Vowel Strings](https://leetcode.com/problems/count-sorted-vowel-strings/)
 */
class Solution {
    private val vowelsCount = 5

    fun countVowelStrings(n: Int): Int {
        val dp = Array(n) { IntArray(vowelsCount) { -1 } }
        return countVowelStrings(dp, 0, 0, n)
    }

    private fun countVowelStrings(dp: Array<IntArray>, length: Int, startVowel: Int, n: Int): Int {
        if (dp[length][startVowel] < 0) {
            dp[length][startVowel] =
                if (length == n - 1)
                    vowelsCount - startVowel
                else
                    (startVowel until vowelsCount).sumOf { countVowelStrings(dp, length + 1, it, n) }
        }
        return dp[length][startVowel]
    }
}