/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        int ans = helper(node);
        return ans;
    }
    
    int helper(Node root) {
        
        if(root == null) {
            return 0;
        }
        
        int l = helper(root.left);
        int r = helper(root.right);
        int sum = l + r;
        return (sum == 0) ? 1 : sum;
        
    }
}