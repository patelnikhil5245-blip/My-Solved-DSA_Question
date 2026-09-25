class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] index = new Integer[n];

        for (int i = 0; i < n; i++)
            index[i] = i;

        Arrays.sort(index, (a, b) -> {
            int sa = sum(nums[a]);
            int sb = sum(nums[b]);

            if (sa != sb)
                return sa - sb;

            return nums[a] - nums[b];
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || index[i] == i)
                continue;

            int j = i;
            int cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = index[j];
                cycle++;
            }

            swaps += cycle - 1;
        }

        return swaps;
    }

    int sum(int x) {
        int s = 0;

        while (x > 0) {
            s += x % 10;
            x /= 10;
        }

        return s;
    }
}