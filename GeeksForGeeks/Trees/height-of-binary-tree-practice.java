/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
        // code here
        // Base case: if the node is null, return -1 (no edges)
        if (root == null) {
            return -1;
        }
        
        // Recursively find the height of left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        // The height is 1 (for the current edge) plus the maximum of subtrees
        return 1 + Math.max(leftHeight, rightHeight);
    }
}