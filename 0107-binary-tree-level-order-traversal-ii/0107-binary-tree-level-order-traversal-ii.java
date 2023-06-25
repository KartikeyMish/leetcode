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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null){
            return output;
        }
        q.add(root);
        while(!q.isEmpty()){
            int levels=q.size();
            List<Integer> sublevel = new ArrayList<Integer>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                sublevel.add(q.remove().val);
            }
            output.add(sublevel);
        }
        Collections.reverse(output);
        return output;
    }
}