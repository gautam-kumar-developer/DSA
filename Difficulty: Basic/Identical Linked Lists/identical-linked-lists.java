/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node cur1 = head1;
        Node cur2 = head2;
        
        while(cur1 != null || cur2 != null) {
            if(cur1 == null || cur2 == null) {
                return false;
            } else if (cur1.data != cur2.data){
                return false;
            }
            if(cur1 != null)
                cur1 = cur1.next;
            if(cur2 != null)
                cur2 = cur2.next;
        }
        
        return true;
    }
}