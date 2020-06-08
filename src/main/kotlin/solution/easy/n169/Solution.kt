package solution.easy.n169

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var value = 0
        var current = 0
        for (num in nums) {
            if (value == 0) {
                current = num
            }
            if (num == current) {
                value++
            } else {
                value--
            }
        }
        return current
    }
}