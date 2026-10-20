class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx = new Integer[names.length];
        // (1) fill idx with 0, 1, 2, ... n-1
        for (int i = 0; i < idx.length; i++) {
            idx[i] = i;
        }
        // (2) the comparator goes here, inside the sort call
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);
        // (3) build the answer using the sorted indices
        String[] result = new String[names.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = names[idx[i]];
        }
        return result;
    }
}