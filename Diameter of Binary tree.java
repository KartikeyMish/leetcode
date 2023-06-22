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

// we take max of left diamater + right diameter and path through root node (i.e. left tree height + right tree height + 1)
class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        if(root == null){return 0;}
        return Math.max(Math.max(diameter(root.left),diameter(root.right)),height(root.left)+height(root.right)+1);
    }
    static int height(Node root){
        if(root == null){return 0;}
        return Math.max(height(root.left),height(root.right))+1;
    }
}
