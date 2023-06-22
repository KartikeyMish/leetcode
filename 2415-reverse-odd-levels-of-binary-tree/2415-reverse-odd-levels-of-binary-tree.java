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
    static int indx= 0; 
    public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0 ;
        helperTreeNode(root.left,root.right,level);
        return root;
    }

    void helperTreeNode(TreeNode first,TreeNode second, int level){
        if(first == null || second == null) return ;
        if(level%2==0) {
            int swap = first.val;
            first.val=second.val;
            second.val = swap;
        }
        helperTreeNode(first.left,second.right,level+1);
        helperTreeNode(first.right,second.left,level+1);
        
    }
}