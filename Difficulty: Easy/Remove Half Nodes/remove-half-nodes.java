/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

*/

class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        
        if(root == null) {
            return null;
        }
        
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
        
        //Leaf Node 
        if(root.left == null && root.right == null)
            return root;
            
        // Half Node
        if(root.left == null && root.right != null)
            return root.right;
            
        if(root.right == null && root.left != null)
            return root.left;
            
        // Full Node
        return root;
        
    }

}