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
    static List<Integer> list;
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<Integer>();
        traverse(root,0);
        return list;
    }
    private static void traverse(TreeNode root,int depth){
        if(root==null)return;
        if(list.size()==depth){
            list.add(root.val); 
        }
        traverse(root.right,depth+1);
        traverse(root.left,depth+1);
    }

}