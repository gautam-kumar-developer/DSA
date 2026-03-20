/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {

        Node node = new Node(x);
        
        if(head == null) 
            return node;
            
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        
        cur.next = node;
        
        return head;
    }
}