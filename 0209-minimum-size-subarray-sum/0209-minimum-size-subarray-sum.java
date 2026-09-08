class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int j=0,
        i=0;
        int Minsize=Integer.MAX_VALUE;
        int sum=0;
        
        while(i<n){
            sum+=nums[i];
            
            while(sum>=target){
                Minsize=Math.min(Minsize,i-j+1);
                sum-=nums[j];
                j+=1;
            }
            i+=1;
            
          }
          
          return Minsize==Integer.MAX_VALUE?0:Minsize;

         
    }
}