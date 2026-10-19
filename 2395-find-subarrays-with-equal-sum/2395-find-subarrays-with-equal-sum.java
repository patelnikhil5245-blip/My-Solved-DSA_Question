class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
       HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n-1;i++){
            int sum=nums[i]+nums[i+1];
        if(st.contains(sum))
          return true;
        st.add(sum);  
        }
        return false;

    }
}