class Solution {
    public long[] resultArray(int[] nums, int k) {

        long[] ans = new long[k];
        int[] dp = new int[k];

        for (int num : nums) {

            int[] newDP = new int[k];

            // Start new subarray
            newDP[num % k]++;

            // Extend previous subarrays
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {

                    int newRemainder = (int)((long) r * num % k);

                    newDP[newRemainder] += dp[r];
                }
            }

            // Add to answer
            for (int r = 0; r < k; r++) {
                ans[r] += newDP[r];
            }

            dp = newDP;
        }

        return ans;
    }
}