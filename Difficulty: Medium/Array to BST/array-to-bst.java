/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        return helper(arr, 0, arr.length - 1);
    }
    
    // Helper method that uses the inOrder traversal approach to sorted order
    // First create the root node by mid element
    // Then the left subTree by calling recussively on start to mid - 1
    // Then the right subTree by calling recursively on mid + 1 to end
    private Node helper(int[] arr, int start, int end) {
        
        // Base Condition : When the start crosses the end index
        if(start > end)
            return null;
            
        int mid = start + (end - start) / 2;
        
        // Creating the root node
        Node root = new Node(arr[mid]);
        
        // Call for left SubTree
        root.left = helper(arr, start, mid - 1);
        
        // Call fot the right SubTree
        root.right = helper(arr, mid + 1, end);
        
        
        // Returning the root of the BST created so far
        return root;
    }
}