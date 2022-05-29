package leetcode.solution.n374

/**
 * [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)
 */
class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var l = 1
        var r = n
        while (l <= r) {
            val m = l + (r - l) / 2
            when (guess(m)) {
                0 -> return m
                1 -> l = m + 1
                else -> r = m - 1
            }
        }
        return -1
    }
}

abstract class GuessGame {
    /**
     * @param num your guess
     * @return -1 if num is higher than the picked number
     *          1 if num is lower than the picked number
     *          otherwise return 0
     */
    fun guess(num: Int): Int = 0

    abstract fun guessNumber(n: Int): Int
}