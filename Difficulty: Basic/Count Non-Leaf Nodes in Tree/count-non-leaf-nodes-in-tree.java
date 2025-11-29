/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    int countNonLeafNodes(Node root) {
        return traverse(root);
    }
    
    private int traverse(Node root) {
        if((root == null) || (root.left == null && root.right == null) ) 
            return 0;
        
        return (traverse(root.left) + 1 + traverse(root.right));
    }
}


// Time : O(N) where N is no. of nodes.
// Space : O(N)