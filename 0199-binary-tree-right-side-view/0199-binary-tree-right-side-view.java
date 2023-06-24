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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root,list,0);
        return list;
    }
        public void traverse(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){return;}
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        traverse(curr.right, result, currDepth + 1);
        traverse(curr.left, result, currDepth + 1);
    }
}