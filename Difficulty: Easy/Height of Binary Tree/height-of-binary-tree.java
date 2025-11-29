/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        if((root == null) || (root.left == null && root.right == null) )
            return 0;
        
        return (1 + (Math.max(height(root.left), height(root.right))));
        
    }
}

// Time : O(N) where N is no. of nodes.
// Space : O(N)