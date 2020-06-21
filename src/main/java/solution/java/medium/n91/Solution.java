package solution.java.medium.n91;

/**
 * 91. Decode Ways
 * <p>
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.
 */
public class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) > '0') {
                dp[i] += dp[i - 1];
            }
            if (i >= 2 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7'))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}