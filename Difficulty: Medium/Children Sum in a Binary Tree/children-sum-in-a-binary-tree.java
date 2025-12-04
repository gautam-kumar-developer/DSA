/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        return (helper(root) != -1);
        
    }
    
    private int helper(Node root) {
        if(root == null)
            return 0;
            
        if(root.left == null && root.right == null)
            return root.data;
            
        int left = helper(root.left);
        if(left == -1)
            return -1;
            
        int right = helper(root.right);
        if(right == -1)
            return -1;
            
        
            
        if((left + right) != root.data)
            return -1;
            
        return root.data;
    }
}