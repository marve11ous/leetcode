package solution.medium.n8

import java.math.BigInteger

class Solution {
    companion object {
        val regex = "([+-]?)(\\d+)".toRegex()
        val splitRegex = "[^-+\\d]".toRegex()
    }
    fun myAtoi(str: String): Int {
        val split = str.trim().split(splitRegex)
        if (split.isEmpty()) {
            return 0
        }
        val s = split[0]
        val matchResult = regex.find(s)
        if (matchResult == null || !s.startsWith(matchResult.groupValues[0])) {
            return 0
        }
        var num = matchResult.groupValues[2].toBigIntegerOrNull() ?: return 0
        return if (matchResult.groupValues[1] == "-") {
            num = num.negate()
            if (num <= BigInteger.valueOf(Int.MIN_VALUE.toLong())) Int.MIN_VALUE else num.toInt()
        } else {
            if (num >= BigInteger.valueOf(Int.MAX_VALUE.toLong())) Int.MAX_VALUE else num.toInt()
        }
    }
}