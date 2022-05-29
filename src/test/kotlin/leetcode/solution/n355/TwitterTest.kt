package leetcode.solution.n355

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwitterTest {

    @Test
    fun test() {
        val twitter = Twitter()
        twitter.postTweet(1, 5)
        assertEquals(listOf(5), twitter.getNewsFeed(1))
        twitter.follow(1, 2)
        twitter.postTweet(2, 6)
        assertEquals(listOf(6, 5), twitter.getNewsFeed(1))
        twitter.unfollow(1, 2)
        twitter.unfollow(1, 1)
        assertEquals(listOf(5), twitter.getNewsFeed(1))
    }

    @Test
    fun test2() {
        val twitter = Twitter()
        twitter.postTweet(1, 4)
        assertEquals(listOf(4), twitter.getNewsFeed(1))
        twitter.postTweet(2, 5)
        twitter.unfollow(1, 2)
        assertEquals(listOf(4), twitter.getNewsFeed(1))
    }

    @Test
    fun test3() {
        val twitter = Twitter()
        twitter.postTweet(1, 4)
        twitter.postTweet(2, 5)
        twitter.unfollow(1, 2)
        twitter.follow(1, 2)
        assertEquals(listOf(5, 4), twitter.getNewsFeed(1))
    }

}