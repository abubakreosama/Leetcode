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

    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> leftside = new ArrayList<>();
        ArrayList<Integer> rightside = new ArrayList<>();
        traverseLeftWay(root.left, leftside);
        traverseRightWay(root.right, rightside);
        return leftside.equals(rightside);

    }
    public void traverseLeftWay(TreeNode root, ArrayList<Integer> tree) {
        if (root == null) {
            tree.add(-420);
            return;
        }
        traverseLeftWay(root.left, tree);
        traverseLeftWay(root.right, tree);
        tree.add(root.val);
        
    }
    public void traverseRightWay(TreeNode root, ArrayList<Integer> tree) {
        if (root == null) {
            tree.add(-420);
            return;
        }
        traverseRightWay(root.right, tree);
        traverseRightWay(root.left, tree);
        tree.add(root.val);
        
    }
}