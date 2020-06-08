package solution.easy.n14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        var i = 0
        val set: MutableSet<Char> = HashSet()
        main@ while (true) {
            for (s in strs) {
                if (s.length <= i) {
                    break@main
                }
                set.add(s[i])
            }
            if (set.size == 1) {
                val it = set.iterator()
                result += it.next()
                it.remove()
                i++
            } else {
                break
            }
        }
        return result
    }
}