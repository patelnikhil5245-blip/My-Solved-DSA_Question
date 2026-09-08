class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0,sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        int dups=0;
        for (int i = 0; i < k; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            sum += nums[i];

            if (map.get(nums[i]) > 1) {
                dups++;
            }
        }
        if(dups==0)
         max=Math.max(sum,max);
        for(int i=k;i<nums.length;i++){
            int numToAdd=nums[i];
            int numToRemove=nums[i-k];

            if(!map.containsKey(nums[i])){
                map.put(numToAdd,0);
            }
            map.put(numToAdd,map.get(numToAdd)+1);
            if(map.get(numToAdd)>1){
                dups+=1;
            }
            sum+=numToAdd;
            if(map.get(numToRemove)>1){
                dups-=1;
            }
            map.put(numToRemove,map.get(numToRemove)-1);
            sum-=numToRemove;
            if(dups==0){
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}