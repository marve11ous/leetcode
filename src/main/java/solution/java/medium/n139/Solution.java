package solution.java.medium.n139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 139. Word Break
 * <p>
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be
 * segmented into a space-separated sequence of one or more dictionary words.
 * Note:
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if (!dp[i]) {
                continue;
            }
            for (int j = i + 1; j <= s.length(); j++) {
                dp[j] |= dict.contains(s.substring(i, j));
            }
        }
        return dp[s.length()];
    }
}