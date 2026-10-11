class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        subset(nums,0,ans,curr);
        return ans;
    }
    public void subset(int []nums,int index, List<List<Integer>> ans,List<Integer> curr){
        
          ans.add(new ArrayList<>(curr));
          for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])
               continue;
          
        curr.add(nums[i]);
        subset(nums,i+1,ans,curr);
        curr.remove(curr.size()-1);
          }
    }
}