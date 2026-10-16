/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/

class Solution {
    public int minValue(Node root) {
        // code here
        if(root == null){
            return -1;
        }
    Node curr = root;
    while(curr.left != null){
        curr=curr.left;
    }
    return curr.data;
    }
}