package leetcode.solution.n981

/**
 * [981. Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/)
 */
class TimeMap {

    private val map = HashMap<String, ArrayList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.compute(key) { _, current -> (current ?: ArrayList()).also { it.add(timestamp to value) } }
    }

    fun get(key: String, timestamp: Int): String {
        val list = map[key]
        if (list != null) {
            var l = 0
            var r = list.size - 1
            while (l < r) {
                val mid = l + (r - l + 1) / 2
                if (list[mid].first <= timestamp) l = mid else r = mid - 1
            }
            if (list[l].first <= timestamp) return list[l].second
        }
        return ""
    }

}