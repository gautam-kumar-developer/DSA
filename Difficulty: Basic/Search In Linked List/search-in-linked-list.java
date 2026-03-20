// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        Node cur = head;
        while(cur != null) {
            if(cur.data == x)
                return true;
                
            cur = cur.next;
        }
        
        return false;
    }
}