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
    public TreeNode searchBST(TreeNode root, int val) {
        return traversal(root,val);
    }
    public TreeNode traversal(TreeNode root, int target) {
        if (root == null) return null;
        if (root.val == target) {
            return root;
        }

        if(target < root.val) {
            return traversal(root.left, target);
        }

        if(target > root.val) {
            return traversal(root.right,target);
        }
        return null;
    }
}