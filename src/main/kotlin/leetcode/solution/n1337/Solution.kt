package leetcode.solution.n1337

import java.util.PriorityQueue

/**
 * [1337. The K Weakest Rows in a Matrix](https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/)
 */
class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val pq = PriorityQueue(Comparator<Pair<Int, Int>> { o1, o2 -> o1.second - o2.second }
            .thenComparing { o1, o2 -> o1.first - o2.first })
        for (i in mat.indices) {
            var j = 0
            while (j < mat[i].size && mat[i][j] != 0) j++
            pq.add(i to j)
        }
        val result = IntArray(k)
        for (i in result.indices) {
            result[i] = pq.poll().first
        }
        return result
    }
}