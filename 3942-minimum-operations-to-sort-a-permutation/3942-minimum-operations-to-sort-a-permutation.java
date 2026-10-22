class Solution {
    public int minOperations(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for (int k=0;k<n;k++) {
            boolean yes=true;
            for (int i=0;i<n;i++) {
                if (nums[(i+k)%n]!=i) {
                    yes = false;
                    break;
                }
            }
            if (yes) {
                ans = Math.min(ans,Math.min(k,n-k+2));
            }
        }
        for (int k=0;k<n;k++) {
            boolean yes = true;

            for (int i=0;i<n;i++) {
                if (nums[n-1-((i+k)%n)]!=i) {
                    yes = false;
                    break;
                }
            }
            if (yes) {
                ans=Math.min(ans,1+Math.min(k,n-k));
            }
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}