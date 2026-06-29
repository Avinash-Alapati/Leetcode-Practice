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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> op = new ArrayList<>();

        preOrder(root, op);
        return op;
    }

    public void preOrder(TreeNode root, ArrayList<Integer> op) {
        if(root == null) {
            return;
        }

        op.add(root.val);
        preOrder(root.left, op);
        preOrder(root.right, op);

    }
}