/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preOrderTraversal(root, ans);
        return ans;
    }
    
    private void preOrderTraversal(Node root, ArrayList<Integer> arrList) {
        if(root != null) {
            arrList.add(root.data);
            preOrderTraversal(root.left, arrList);
            preOrderTraversal(root.right, arrList);
        }
    }
}