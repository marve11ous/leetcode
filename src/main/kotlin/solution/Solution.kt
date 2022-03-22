package solution

class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        arr.sort()
        val result = ArrayList<List<Int>>()
        var minDiff = Int.MAX_VALUE
        for (i in 0 until arr.size - 1) {
            val diff = arr[i + 1] - arr[i]
            if (diff < minDiff) {
                minDiff = diff
                result.clear()
            }
            if (diff == minDiff) {
                result.add(listOf(arr[i], arr[i + 1]))
            }
        }
        return result
    }
}