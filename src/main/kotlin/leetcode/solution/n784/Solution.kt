package leetcode.solution.n784

/**
 * [784. Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation/)
 */
class Solution {
    fun letterCasePermutation(s: String): List<String> {
        return ArrayList<String>().apply { backtrack(s.toCharArray(), 0, 0) }
    }

    private fun ArrayList<String>.backtrack(result: CharArray, current: Int, from: Int) {
        if (current == result.size) {
            add(String(result))
            return
        }
        for (i in from until result.size) {
            result[i].permutations().forEach {
                result[i] = it
                backtrack(result, current + 1, i + 1)
            }
        }
    }

    private fun Char.permutations(): List<Char> {
        return when {
            isDigit() -> listOf(this)
            isLowerCase() -> listOf(this, Character.toUpperCase(this))
            else -> listOf(Character.toLowerCase(this), this)
        }
    }
}