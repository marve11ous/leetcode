package solution.java.medium.n221;

/**
 * 221. Maximal Square
 * <p>
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = m > 0 ? matrix[0].length : 0;
        int[][] dp = new int[m + 1][n + 1];
        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] != '1') {
                    continue;
                }
                dp[i][j] = dp[i - 1][j];
                if (dp[i][j - 1] < dp[i][j]) {
                    dp[i][j] = dp[i][j - 1];
                }
                if (dp[i - 1][j - 1] < dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                dp[i][j]++;
                if (dp[i][j] > result) {
                    result = dp[i][j];
                }
            }
        }
        return result * result;
    }
}