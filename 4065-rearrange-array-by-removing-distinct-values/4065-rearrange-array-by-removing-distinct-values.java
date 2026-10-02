class Solution {
    public int[] rearrangeArray(int[] nums) {
         Map<Integer, Integer> map = new TreeMap<>();

        // frequency count
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] ans = new int[nums.length];
        int k = 0;

        while (!map.isEmpty()) {

            // current distinct values ascending order
            for (int x : map.keySet()) {
                ans[k++] = x;
            }

            // remove one occurrence
            for (int x : new ArrayList<>(map.keySet())) {
                if (map.get(x) == 1) {
                    map.remove(x);
                } else {
                    map.put(x, map.get(x) - 1);
                }
            }
        }

        return ans;
    }
}
