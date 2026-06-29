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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> op = new ArrayList<>();
        postOrderTraversal(root, op);
        return op;
    }

    public void postOrderTraversal(TreeNode root, ArrayList<Integer> op) {
        if (root == null){
            return;
        }

        postOrderTraversal(root.left, op);
        postOrderTraversal(root.right, op);
        op.add(root.val);
    }
}