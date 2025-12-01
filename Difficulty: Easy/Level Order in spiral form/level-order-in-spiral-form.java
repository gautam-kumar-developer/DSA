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
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(root);
        int level = 0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            Stack<Integer> stk = new Stack<>();
            
            for(int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                if(level % 2 == 0)
                    stk.push(curNode.data);
                else 
                    ans.add(curNode.data);
                    
                if(curNode.left != null)
                    queue.offer(curNode.left);
                if(curNode.right != null)
                    queue.offer(curNode.right);
            }
            
            while(!stk.empty()){
                ans.add(stk.pop());
            }
            level++;
        }
        
        return ans;
    }
}