/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
    }
    
    private void traverse(Node root, ArrayList<Integer> arrList) {
        if(root == null)
            return;
            
        traverse(root.left, arrList);
        arrList.add(root.data);
        traverse(root.right, arrList);
    }
}