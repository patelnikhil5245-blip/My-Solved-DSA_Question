class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        nums.sort((a,b)->a-b);
        int l=0;
        int r=n-1;
        int ans=0;
        while(l!=r){
            if(nums.get(l)+nums.get(r)<target){
             ans+=r-l;
             l++;
            }
            else 
                r--;
        }
        return ans;
   }
}   