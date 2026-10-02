class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;
        int count=0;
       for (int i = nums.length - 1; i >= 0; i--) {

            if (sum + nums[i] > 0) {
                sum += nums[i];
                count++;
            }
        }
       return count;
    }
}