class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int n=player1.length;
        int m=player2.length;
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=player1[i];
        
            if ((i >= 1 && player1[i - 1] == 10) ||
                (i >= 2 && player1[i - 2] == 10)) {
                sum1 += player1[i];
                }
        }    
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=player2[i];
            if ((i >= 1 && player2[i - 1] == 10) ||
                (i >= 2 && player2[i - 2] == 10)) {
                sum2 += player2[i];
                }
        }
        if(sum1>sum2)
        return 1;
        else if(sum1<sum2)
        return 2;
        else
        return 0;
    }
}