package leetcode.solution.n2284

/**
 * [2284. Sender With Largest Word Count](https://leetcode.com/problems/sender-with-largest-word-count/)
 */
class Solution {
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val countByName = HashMap<String, Int>()
        for (i in messages.indices) {
            val wordCount = messages[i].split(" ").count()
            countByName.compute(senders[i]) { _, v -> (v ?: 0) + wordCount }
        }
        var maxName = ""
        var maxCount = 0
        countByName.forEach { (name, count) ->
            if (maxCount < count) {
                maxName = name
                maxCount = count
            } else if (maxCount == count && name > maxName) {
                maxName = name
            }
        }
        return maxName
    }
}