package leetcode.solution.n1845

import java.util.PriorityQueue

/**
 * [1845. Seat Reservation Manager](https://leetcode.com/problems/seat-reservation-manager/)
 */
class SeatManager(n: Int) {
    val pq = PriorityQueue<Int>().apply { for (i in 1..n) add(i) }

    fun reserve(): Int {
        return pq.poll()
    }

    fun unreserve(seatNumber: Int) {
        pq.add(seatNumber)
    }

}