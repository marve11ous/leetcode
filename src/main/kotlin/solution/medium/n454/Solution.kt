package solution.medium.n454

/**
 * 454. 4Sum II
 *
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that
 * A[i] + B[j] + C[k] + D[l] is zero.
 * To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500.
 * All integers are in the range of -2^28 to 2^28 - 1 and the result is guaranteed to be at most 2^31 - 1.
 */
class Solution {
    fun fourSumCount(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
        if (A.isEmpty()) {
            return 0
        }
        val map = HashMap<Int, Int>()
        for (i in A.indices) {
            for (j in B.indices) {
                map.merge(A[i] + B[j], 1) { o, n -> o + n }
            }
        }
        var result = 0
        for (i in C.indices) {
            for (j in D.indices) {
                result += map[-C[i] - D[j]] ?: 0
            }
        }
        return result
    }
}