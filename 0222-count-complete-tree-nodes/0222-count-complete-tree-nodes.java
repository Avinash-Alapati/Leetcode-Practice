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
    public int countNodes(TreeNode root) {
        ArrayList<Integer> op = new ArrayList<>();
        preOrderTraversal(root, op);
        return op.size();
    }

    public void preOrderTraversal(TreeNode root, ArrayList<Integer> op) {

        if (root == null){
            return;
        }

        op.add(root.val);
        preOrderTraversal(root.left,op);
        preOrderTraversal(root.right,op);
    }
}