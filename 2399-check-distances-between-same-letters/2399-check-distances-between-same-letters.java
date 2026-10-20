class Solution {
    public boolean checkDistances(String s, int[] distance) {
       int  n=s.length();
      int arr[]=new int[26];
      for(int i=0;i<n;i++){
        int p=s.charAt(i)-'a';
        if(arr[p]==0){
            arr[p]=i+1;
        }
        else{
            int gap=i-arr[p];
            if(gap!=distance[p])
              return false;
        }
      }
       return true;
       
    }
}