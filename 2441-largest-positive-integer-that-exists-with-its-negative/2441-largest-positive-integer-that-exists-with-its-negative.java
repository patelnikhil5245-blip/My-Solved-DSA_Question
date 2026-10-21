class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        int max=Math.abs(nums[i]);
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]<0 && max==nums[j])
               return nums[j];
        }
      }
        return -1;
    }    
}
// class Solution {
//     public int findMaxK(int[] nums) {
//         int maxK=-1;
//         Set<Integer> seen=new HashSet<>();
        
//         for(int num:nums) {
//             if (seen.contains(-num)) maxK = Math.max(maxK, Math.abs(num));
//             seen.add(num);
//         }
//         return maxK;
//     }
// }