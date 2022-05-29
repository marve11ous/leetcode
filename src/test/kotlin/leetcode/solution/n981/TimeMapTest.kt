package leetcode.solution.n981

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TimeMapTest {

    @Test
    fun test() {
        val timeMap = TimeMap()

        // store the key "foo" and value "bar" along with timestamp = 1
        timeMap.set("foo", "bar", 1)

        assertEquals("bar", timeMap.get("foo", 1))

        // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2,
        // then the only value is at timestamp 1 is "bar"
        assertEquals("bar", timeMap.get("foo", 3))

        // store the key "foo" and value "bar2" along with timestamp = 4
        timeMap.set("foo", "bar2", 4)

        assertEquals("bar2", timeMap.get("foo", 4))
        assertEquals("bar2", timeMap.get("foo", 5))
    }
}