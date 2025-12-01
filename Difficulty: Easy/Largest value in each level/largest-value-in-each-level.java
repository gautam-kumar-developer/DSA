// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        return levelOderTraversal(root);
        
    }
    
    
    private ArrayList<Integer> levelOderTraversal(Node root) {
        ArrayList<Integer> arrList = new ArrayList<>();
        if(root == null)
            return arrList;
            
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curLevel = new ArrayList<Integer>();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                int val = curNode.data;
                if(val > max) 
                    max = val;
                if(curNode.left != null) queue.offer(curNode.left);
                if(curNode.right != null) queue.offer(curNode.right);
            }
            arrList.add(max);
        }
        
        return arrList;
    }
}