package solution.hard.n2286

import kotlin.math.min

/**
 * [2286. Booking Concert Tickets in Groups](https://leetcode.com/problems/booking-concert-tickets-in-groups/)
 */
class BookMyShow(n: Int, m: Int) {
    private val hall = ArrayList<ArrayList<IntRange>>(n)
        .apply { repeat(n) { add(ArrayList<IntRange>().also { it.add(0 until m) }) } }
    private var freeInRow = IntArray(n) { m }
    private var firstFreeRow = 0

    fun gather(k: Int, maxRow: Int): IntArray {
        for (i in firstFreeRow..maxRow) {
            if (freeInRow[i] < k) continue
            hall[i].forEachIndexed { j, range ->
                if (range.last - range.first + 1 >= k) {
                    freeInRow[i] -= k
                    if (range.last - range.first < k) hall[i].removeAt(j)
                    else hall[i][j] = range.first + k..range.last
                    return intArrayOf(i, range.first)
                }
            }
        }
        return intArrayOf()
    }

    fun scatter(k: Int, maxRow: Int): Boolean {
        var freeCount = 0
        for (i in firstFreeRow..maxRow) {
            freeCount += freeInRow[i]
            if (freeCount >= k) break
        }
        if (k > freeCount) return false
        var left = k
        for (i in firstFreeRow..maxRow) {
            val take = min(left, freeInRow[i])
            if (take == 0) {
                firstFreeRow = i + 1
                continue
            }
            if (freeInRow[i] > take) {
                var l = take
                for (j in hall[i].indices) {
                    val range = hall[i][j]
                    l -= range.last - range.first + 1
                    if (l >= 0) hall[i].removeAt(j) else hall[i][j] = range.last + l + 1..range.last
                }
            } else {
                hall[i].clear()
            }
            freeInRow[i] -= take
            left -= take
            if (left == 0) return true
        }
        return false
    }

}