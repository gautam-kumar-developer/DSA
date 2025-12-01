class Solution {
    Node nextRight(Node root, int key) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> arr = new ArrayList<>();
            int index = -1;
            for(int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                arr.add(curNode.data);
                if(curNode.data == key)
                    index = i;
                    
                if(curNode.left != null) queue.offer(curNode.left);
                if(curNode.right != null) queue.offer(curNode.right);
            }
            
            if((index != -1) && (index < size - 1))
                return new Node(arr.get(index + 1));
        }
        
        return new Node(-1);
    }
}