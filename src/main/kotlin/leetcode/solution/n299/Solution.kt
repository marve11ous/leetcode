package leetcode.solution.n299

import kotlin.math.min

/**
 * [299. Bulls and Cows](https://leetcode.com/problems/bulls-and-cows/)
 */
class Solution {
    fun getHint(secret: String, guess: String): String {
        val secretMap = secret.buildMap()
        val guessMap = guess.buildMap()
        var bulls = 0
        var cows = 0
        guessMap.forEach { (num, guessIndices) ->
            secretMap[num]?.let { secretIndices ->
                var notMatch = 0
                guessIndices.forEach { if (secretIndices.remove(it)) bulls++ else notMatch++ }
                cows += min(notMatch, secretIndices.size)
            }
        }
        return "${bulls}A${cows}B"
    }

    private fun String.buildMap(): Map<Char, HashSet<Int>> =
        HashMap<Char, HashSet<Int>>().also {
            for (i in indices) it.computeIfAbsent(this[i]) { HashSet() }.add(i)
        }
}