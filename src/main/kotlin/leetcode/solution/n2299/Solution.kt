package leetcode.solution.n2299

/**
 * [2299. Strong Password Checker II](https://leetcode.com/problems/strong-password-checker-ii/)
 */
class Solution {
    fun strongPasswordCheckerII(password: String): Boolean {
        if (password.length < 8) return false
        var lowercase = false
        var uppercase = false
        var digit = false
        var special = false
        for (i in password.indices) {
            when {
                i + 1 < password.length && password[i] == password[i + 1] -> return false
                !lowercase && password[i].isLowerCase() -> lowercase = true
                !uppercase && password[i].isUpperCase() -> uppercase = true
                !digit && password[i].isDigit() -> digit = true
                !special && "!@#$%^&*()-+".contains(password[i]) -> special = true
            }
        }
        return lowercase && uppercase && digit && special
    }
}