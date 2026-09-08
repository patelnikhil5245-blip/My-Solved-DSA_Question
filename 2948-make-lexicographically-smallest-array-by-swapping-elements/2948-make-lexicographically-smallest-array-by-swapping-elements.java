class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
     int n = nums.length;

        // order[i] = original index of the i-th smallest value
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> nums[a] - nums[b]);

        // sortedVals[i] = value at that rank
        int[] sortedVals = new int[n];
        for (int i = 0; i < n; i++) sortedVals[i] = nums[order[i]];

        int start = 0;
        while (start < n) {
            int end = start;
            while (end + 1 < n && sortedVals[end + 1] - sortedVals[end] <= limit) {
                end++;
            }

            int groupSize = end - start + 1;
            int[] indices = new int[groupSize];
            for (int i = 0; i < groupSize; i++) {
                indices[i] = order[start + i];
            }

            Arrays.sort(indices); // put positions back in original order

            for (int i = 0; i < groupSize; i++) {
                nums[indices[i]] = sortedVals[start + i];
            }

            start = end + 1;
        }

        return nums;   
    }
}