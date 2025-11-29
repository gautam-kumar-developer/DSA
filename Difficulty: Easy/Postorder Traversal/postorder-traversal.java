/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
    }
    
    private void traverse(Node root, ArrayList<Integer> arr) {
        if(root == null)
            return;
        traverse(root.left, arr);
        traverse(root.right, arr);
        arr.add(root.data);
    }
}


// Time : O(N) where N is no. of nodes.
// Space : O(N) for recusion stack