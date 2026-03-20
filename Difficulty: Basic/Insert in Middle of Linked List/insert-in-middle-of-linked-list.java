/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node node = new Node(x);
        
        int mid = (int)(Math.ceil(length(head) / 2.00));
        
        if(mid == 0)
            return node;
            
        Node cur = head;
        Node pre = head;
        int i = 0;
        while(cur != null && i < mid) {
            pre = cur;
            cur = cur.next;
            i++;
        }
        
        node.next = pre.next;
        pre.next = node;
        
        return head;
        
    }
    
    public int length(Node head) {
        int len = 0;
        
        Node cur = head;
        
        while(cur != null){
            len++;
            cur = cur.next;
        }
        
        return len;
    }
}