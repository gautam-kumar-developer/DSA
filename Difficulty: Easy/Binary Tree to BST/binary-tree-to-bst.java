/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        // Step 1 : Find the inOderTraversal of Binary Tree
        ArrayList<Integer> ans = new ArrayList<>();
        inOrderTraversalOfBT(root, ans);
        
        // Step 2 : Sort the ArrayList
        Collections.sort(ans);
        
        // Step 3 : Find the inOrdertraversal of Binary Search Tree and insert 
        //          the values from ArrayList
        
        inOrderTraversalOfBST(root, ans);
        
        return root;
    }
    
    private void inOrderTraversalOfBT (Node root, ArrayList<Integer> ans) {
        
        if(root == null)
            return;
        inOrderTraversalOfBT(root.left, ans);
        ans.add(root.data);
        inOrderTraversalOfBT(root.right, ans);
        return;
    }
    
    
    private void inOrderTraversalOfBST (Node root, ArrayList<Integer> ans) {
        if(root == null)
            return;
        inOrderTraversalOfBST(root.left, ans);
        if(!ans.isEmpty()) {
            root.data = ans.get(0);
            ans.remove(0);
        }
        inOrderTraversalOfBST(root.right, ans);
    }
}