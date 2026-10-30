class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
         int n = costs.length;
        int[][] a = new int[n][2];
        for (int i=0;i<n;i++) {
            a[i][0]=costs[i];
            a[i][1]=capacity[i];
        }
        Arrays.sort(a,(x, y)->Integer.compare(x[0], y[0]));
        int[] pref=new int[n];
        pref[0]=a[0][1];
        for (int i=1;i<n;i++) {
            pref[i]=Math.max(pref[i - 1],a[i][1]);
        }
        int ans = 0;
        for (int i=0;i<n;i++) {
            int cost=a[i][0];
            int cap=a[i][1];
            if (cost<budget) {
                ans=Math.max(ans,cap);
            }
            int limit = budget - cost;
            int left = 0, right = i - 1;
            int idx = -1;
            while (left<=right) {
                int mid=left+(right - left)/2;
                if (a[mid][0]<limit) {
                    idx=mid;
                    left=mid+1;
                } else {
                    right=mid-1;
                }
            }
            if (idx!=-1) {
                ans=Math.max(ans,cap+pref[idx]);
            }
        }
        return ans;
    }
}
