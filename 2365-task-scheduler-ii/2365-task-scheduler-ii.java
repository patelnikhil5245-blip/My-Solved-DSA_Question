class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        int n=tasks.length;
        HashMap<Integer,Long> ld=new HashMap<>();
        long day=0;
        for(int i=0;i<n;i++){
            if(ld.containsKey(tasks[i])){
                long previousDay = ld.get(tasks[i]);
                long nextDay=previousDay+space+1;
                day=Math.max(day+1,nextDay);
            }
            else{
                day++;
            }
        
            ld.put(tasks[i],day);
        }
        return day;
    }
}