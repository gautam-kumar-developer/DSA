/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        return levelOrderTraversal(root);
        
    }
    
    private ArrayList<Integer> levelOrderTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                
                if(i == size - 1) {
                    ans.add(curNode.data);
                }
                
                if(curNode.left != null) 
                    queue.offer(curNode.left);
                if(curNode.right != null) 
                    queue.offer(curNode.right);
            }
        
        }
        
        return ans;
    }
}