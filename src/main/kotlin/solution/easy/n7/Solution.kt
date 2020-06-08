package solution.easy.n7

class Solution {
    fun reverse(x: Int): Int {
        val sign = if (x > 0) 1 else -1
        var tmp = x * sign
        var result = 0
        while (tmp > 0) {
            val nextResult: Long = result.toLong() * 10 + (tmp % 10)
            if (nextResult > Integer.MAX_VALUE) {
                return 0
            }
            result = nextResult.toInt()
            tmp /= 10
        }
        return result * sign
    }
}