class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==target)
              ls.add(i);
            if(nums[i]>target)
              break; 
        }
        return ls;
    }
}