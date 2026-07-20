/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    private int ans = -1;
    private int cnt = 0;
    public int kthSmallest(Node root, int k) {
        inOrder(root, k);
        return ans;
    } 
    
    public void inOrder(Node root, int k) {
        if(root == null) return;
        
        inOrder(root.left, k);
        cnt++;
        
        if(cnt == k) ans = root.data;
        
        
        inOrder(root.right, k);
        
        return;
    }
}