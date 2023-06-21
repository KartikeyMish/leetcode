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
    private static List<Integer> res ;
    public List<Integer> postorderTraversal(TreeNode root) {
        res = new ArrayList<Integer>();
        traverse(root);
        return res;
    }
    private static void traverse(TreeNode node){
        if (node == null) {
            return;
        }
        traverse(node.left);
        traverse(node.right);
        res.add(node.val);
    }
}