
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
}*/

class Solution {
    public int[] displayList(Node head) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        Node cur = head;
        while(cur != null) {
            ans.add(cur.data);
            cur = cur.next;
        }
        
        int[] result = new int[ans.size()];
        int i = 0;
        for(int val : ans) {
            result[i] = val;
            i++;
        }
        
        
        return result;
    }
}
