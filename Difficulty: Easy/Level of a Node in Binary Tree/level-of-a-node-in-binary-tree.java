class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        int level = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            level++;
            for(int i = 0; i < len; i++) {
                Node temp = q.poll();
                
                if(temp.data == data) return level;
                
                if(temp.left != null) 
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
            }
        }
        
        return 0;
    }
}