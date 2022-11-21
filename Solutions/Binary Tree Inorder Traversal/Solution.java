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
        List<Integer> hinay = new ArrayList();
        traversewithList(root, hinay);
        return hinay;
    }
    public void traversewithList(TreeNode root, List<Integer> lista) {
        if (root == null) {
            return;
        }
        else{
            traversewithList(root.left, lista);
            lista.add(root.val);
            traversewithList(root.right, lista);
        }
    }
}