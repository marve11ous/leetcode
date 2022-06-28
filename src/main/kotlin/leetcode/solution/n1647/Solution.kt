package leetcode.solution.n1647

/**
 * [1647. Minimum Deletions to Make Character Frequencies Unique](https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/)
 */
class Solution {
    fun minDeletions(s: String): Int {
        val set = HashSet<Int>()
        val arr = s.toCharArray()
        arr.sort()
        var i = 0
        var result = 0
        while (i < arr.size) {
            var count = 1
            while (i + 1 < arr.size && arr[i] == arr[i + 1]) {
                i++
                count++
            }
            while (count > 0 && set.contains(count)) {
                result++
                count--
            }
            if (count > 0) set.add(count)
            i++
        }
        return result
    }
}