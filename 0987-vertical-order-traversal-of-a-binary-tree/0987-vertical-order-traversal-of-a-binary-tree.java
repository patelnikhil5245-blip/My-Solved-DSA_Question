/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        List<int[]> list = new ArrayList<>();

        find(root, 0, 0, list);

        Collections.sort(list, (a, b) -> {

            if (a[0] != b[0])
                return a[0] - b[0];

            if (a[1] != b[1])
                return a[1] - b[1];

            return a[2] - b[2];
        });

        int prevX = Integer.MIN_VALUE;

        for (int[] a : list) {

            if (a[0] != prevX) {
                ans.add(new ArrayList<>());
                prevX = a[0];
            }

            ans.get(ans.size() - 1).add(a[2]);
        }

        return ans;
    }

    void find(TreeNode root, int x, int y, List<int[]> list) {

        if (root == null)
            return;

        list.add(new int[]{x, y, root.val});

        find(root.left, x - 1, y + 1, list);
        find(root.right, x + 1, y + 1, list);
    }
}