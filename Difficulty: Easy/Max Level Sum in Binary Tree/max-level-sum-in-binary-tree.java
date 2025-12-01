/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution {
    public int maxLevelSum(Node root) {
        return levelOrderTraversal(root);
    }
    
    private int levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int max = Integer.MIN_VALUE;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            
            for(int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                sum += curNode.data;
                
                if(curNode.left != null) 
                    queue.offer(curNode.left);
                if(curNode.right != null) 
                    queue.offer(curNode.right);
            }
            if(sum > max)
                max = sum;
        }
        
        return max;
    }
}