package solution.easy.n9

class Solution {
    fun isPalindrome(x: Int): Boolean {
        var tmp = x
        var result = 0
        while (tmp > 0) {
            result = result * 10 + (tmp % 10)
            tmp /= 10
        }
        return result == x
    }
}