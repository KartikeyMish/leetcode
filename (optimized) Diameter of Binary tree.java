/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

// Time Complexity : O(n)
class Solution {
    static class TreeInfo{
        int ht,diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo helper(Node root){
        
        if(root == null){return new TreeInfo(0,0);}
        
        TreeInfo left = helper(root.left);
        TreeInfo right = helper(root.right);
        
        int myheight = Math.max(left.ht,right.ht)+1;
        
        int d1 = left.diam;
        int d2 = right.diam;
        int d3 = left.ht+right.ht+1;
        
        int mydiam = Math.max(Math.max(d1,d2),d3);
        
        TreeInfo myinfo = new TreeInfo(myheight,mydiam);
        return myinfo;
    }
    int diameter(Node root) {
        
        return helper(root).diam;
    }
}
