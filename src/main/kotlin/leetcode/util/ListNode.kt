package leetcode.util

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun from(vararg nums: Int): ListNode? {
            val first = ListNode(nums[0])
            var current = first
            for (i in 1 until nums.size) {
                val next = ListNode(nums[i])
                current.next = next
                current = next
            }
            return first
        }

    }
}

fun ListNode?.toArray(): IntArray {
    if (this == null) {
        return intArrayOf()
    }
    val result = ArrayList<Int>()
    var current: ListNode? = this
    while (current != null) {
        result.add(current.`val`)
        current = current.next
    }
    return result.toIntArray()
}
