class Solution {
    public String winningPlayer(int x, int y) {
        int count=0;
        while(x>=1&&y>=4){
            x-=1;
            y-=4;
            count+=1;
        }
        if(count%2==0)
          return "Bob";

        return "Alice";  
    }
}