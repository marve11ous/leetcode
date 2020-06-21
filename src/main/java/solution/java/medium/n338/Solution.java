package solution.java.medium.n338;

/**
 * 338. Counting Bits
 * <p>
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in
 * their binary representation and return them as an array.
 */
class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        if (num == 0) {
            return dp;
        }
        dp[1] = 1;
        int j = 2, k = 4;
        for (int i = 2; i <= num; i++) {
            if (i == k) {
                dp[i] = 1;
                j = k;
                k *= 2;
            }
            dp[i] = dp[i - j] + 1;
        }
        return dp;
    }
}