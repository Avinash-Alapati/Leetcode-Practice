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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> op = new ArrayList<>();
        inOrderTraversal(root, op);
        return op;
    }

    public void inOrderTraversal(TreeNode root, ArrayList<Integer> op){

        if (root == null){
            return;
        }

        inOrderTraversal(root.left, op);
        op.add(root.val);
        inOrderTraversal(root.right, op);

    } 
}