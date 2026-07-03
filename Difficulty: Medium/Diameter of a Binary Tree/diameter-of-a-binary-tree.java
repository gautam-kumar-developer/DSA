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
} */

class Solution {
    public int diameter(Node root) {
        int[] diameter = new int[1];
        
        helper(root, diameter);
        return diameter[0];
    }
    
    private int helper(Node root, int[] diameter) {
        if(root == null) return 0;
        
        int left = helper(root.left, diameter);
        
        int right = helper(root.right, diameter);
        
        diameter[0] = Math.max(diameter[0], left + right);
        
        return 1 + Math.max(left, right);
    }
}