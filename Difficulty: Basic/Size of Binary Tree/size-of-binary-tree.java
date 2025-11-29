/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int getSize(Node node) {
        return traverse(node);
        
    }
    
    private static int traverse(Node root) {
        if(root == null) 
            return 0;
        return (traverse(root.left) + 1 + traverse(root.right));
    }
}

// Time : O(N) where N is no. of nodes.
// Space : O(N)