package leetcode.solution.n852

/**
 * [852. Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
 */
class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var l = 0
        var r = arr.size - 1
        while (l < r) {
            val mid = l + (r - l) / 2
            if (arr[mid] > arr[l] && arr[mid + 1] > arr[mid]) l = mid else r = mid
        }
        return l + 1
    }
}