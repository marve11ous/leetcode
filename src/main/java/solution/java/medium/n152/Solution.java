package solution.java.medium.n152;

/**
 * 152. Maximum Product Subarray
 * <p>
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has
 * the largest product.
 */
public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int[] dp = new int[nums.length];
            dp[i] = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                dp[j] = dp[j - 1] * nums[j];
                if (dp[j] > result) {
                    result = dp[j];
                }
                if (nums[j] > result) {
                    result = nums[j];
                }
            }
        }
        return result;
    }
}