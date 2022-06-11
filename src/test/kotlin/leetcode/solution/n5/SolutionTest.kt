package leetcode.solution.n5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @CsvSource(
        "a,a",
        "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez,zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez",
        "bananas,anana",
        "abcdbbfcba,bb",
        "aacabdkacaa,aca",
        "adam,ada",
        "abb,bb",
        "babad,bab",
        "cbbd,bb",
        "ac,a",
        "bb,bb",
        "bbb,bbb",
        "bbbb,bbbb",
        "bbbbb,bbbbb",
        "baabb,baab",
        "baab,baab",
        "bbabb,bbabb",
        "bbaabb,bbaabb"
    )
    fun longestPalindrome(str: String, palindromeSubstr: String) {
        assertEquals(palindromeSubstr, solution.longestPalindrome(str))
    }
}