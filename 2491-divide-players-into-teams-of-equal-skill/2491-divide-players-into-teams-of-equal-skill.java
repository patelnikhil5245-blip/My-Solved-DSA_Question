class Solution {
    public long dividePlayers(int[] skill) {
        long ans=0;
        Arrays.sort(skill);
        int i=0;
        int j=skill.length -1;
        int sum=skill[i]+skill[j];
        while(i<j){
            int sum2=skill[i]+skill[j];
            if(sum ==sum2){
                ans+=skill[i]*skill[j];
               i++;
               j--;
            }
            else
              return -1;
        }
        return  ans;
    }
}