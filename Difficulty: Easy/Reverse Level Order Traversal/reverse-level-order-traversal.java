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
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Level order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            
            Node curNode = queue.poll();
            
            ans.add(curNode.data);
            
            if(curNode.right != null) 
                queue.offer(curNode.right);
            if(curNode.left != null)
                queue.offer(curNode.left);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}