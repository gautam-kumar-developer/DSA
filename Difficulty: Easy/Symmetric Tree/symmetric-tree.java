/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        if(root == null)
            return true;
            
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(Node leftSub, Node rightSub) {
        if(leftSub == null && rightSub == null)
            return true;
        if(leftSub == null || rightSub == null || leftSub.data != rightSub.data ) {
            return false;
        }
        
        return isMirror(leftSub.left, rightSub.right) && isMirror(leftSub.right, rightSub.left);
        
    }
}