package leetcode.solution.n278

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var start = 1
        var end = n
        while (end > start) {
            val mid = start + (end - start) / 2
            if (isBadVersion(mid)) {
                end = mid
            } else {
                start = mid + 1
            }
        }
        return start
    }
}