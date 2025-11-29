// User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public void toSumTree(Node root) {
        traverse(root);
    }
    
    private int traverse(Node root) {
        if(root == null) 
            return 0;
        int leftSum = traverse(root.left);
        int rightSum = traverse(root.right);
        int sum = leftSum + root.data + rightSum;
        
        root.data = leftSum + rightSum;
        return sum;
    }
}