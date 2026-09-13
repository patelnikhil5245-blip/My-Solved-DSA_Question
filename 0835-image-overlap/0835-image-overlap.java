class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int ans = 0;

        // Shift rows from -(n-1) to +(n-1)
        for (int rowShift = -(n - 1); rowShift <= n - 1; rowShift++) {

            // Shift columns from -(n-1) to +(n-1)
            for (int colShift = -(n - 1); colShift <= n - 1; colShift++) {

                int overlap = 0;

                for (int i = 0; i < n; i++) {

                    for (int j = 0; j < n; j++) {

                        // Position in img2 after shifting
                        int x = i + rowShift;
                        int y = j + colShift;

                        // Check boundaries
                        if (x >= 0 && x < n && y >= 0 && y < n) {

                            if (img1[i][j] == 1 && img2[x][y] == 1) {
                                overlap++;
                            }
                        }
                    }
                }

                ans = Math.max(ans, overlap);
            }
        }

        return ans;
    }
}
