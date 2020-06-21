package solution.java.medium.n279;

/**
 * 279. Perfect Squares
 * <p>
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int result = Integer.MAX_VALUE;
            int j = 1;
            int pow = 1;
            while (pow <= i) {
                int res = dp[i - pow] + 1;
                if (res < result) {
                    result = res;
                }
                pow = ++j * j;
            }
            dp[i] = result;
        }
        return dp[n];
    }
}