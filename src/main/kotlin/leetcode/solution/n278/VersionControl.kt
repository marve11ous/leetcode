package leetcode.solution.n278

abstract class VersionControl {
    fun isBadVersion(version: Int): Boolean {
        return version >= bad
    }

    abstract fun firstBadVersion(n: Int): Int

    companion object {
        var bad = 0
    }
}
