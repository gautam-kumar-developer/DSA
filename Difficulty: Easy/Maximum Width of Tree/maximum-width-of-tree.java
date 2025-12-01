/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    int maxWidth(Node root) {
        int max = Integer.MIN_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int nodeCnt = 0;
            for(int i = 0; i < size; i++) {
                nodeCnt++;
                Node curNode = queue.poll();
                if(curNode.left != null) 
                    queue.offer(curNode.left);
                if(curNode.right != null) 
                    queue.offer(curNode.right);
            }
            
            max = Math.max(max, nodeCnt);
        }
        
        return max;
    }
}