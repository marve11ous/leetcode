package leetcode.solution.n744

/**
 * [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
 */
class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var l = 0
        var r = letters.size
        while (l < r) {
            val mid = l + (r - l) / 2
            if (letters[mid] <= target) l = mid + 1 else r = mid
        }
        return letters[l % letters.size]
    }
}