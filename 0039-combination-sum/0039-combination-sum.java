class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        subset(candidates, 0, target, list, ans);

        return ans;
    }

    void subset(int[] candidates, int index, int target,
                List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Take current element
        list.add(candidates[index]);
        subset(candidates, index, target - candidates[index], list, ans);

        // Backtrack
        list.remove(list.size() - 1);

        // Skip current element
        subset(candidates, index + 1, target, list, ans);
    }
}