/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // code here
        if(head == null){
         return true;
    }
       Node curr= head.next;
       while(curr!=null){
           if(curr==head){
               return true;
           }
           curr=curr.next;
       }
        return false;
    }
}