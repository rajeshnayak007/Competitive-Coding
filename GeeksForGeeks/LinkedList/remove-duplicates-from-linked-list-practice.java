{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        if(head == null)
        return null;
    
       HashSet<Integer> seen = new HashSet<>();
        Node curr=head;
        Node prev=null;
        while(curr != null){
            int val=curr.data;
        if(seen.contains(val)){
            prev.next=curr.next;
        } else {
            seen.add(val);
            prev=curr;
        }
        curr=curr.next;
       }
       return head;
    }
}