/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        return helper(root);

    }
    
    private static int helper(Node root) {
        if(root == null) 
            return 0;
        return (helper(root.left ) + root.data + helper(root.right));
    }
}

// Time : O(N) where N is no. of nodes.
// Space : O(N)