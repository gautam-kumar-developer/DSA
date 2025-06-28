// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // Gautam's code here
        int n = arr.size();
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        for(int elmt : arr) {
            if(elmt < 0) 
                neg.offer(elmt);
            else 
                pos.offer(elmt);
        }
        
        arr.clear();
        int k = 0;
        int posIdx = 0, negIdx = 0;
        while(!pos.isEmpty() && !neg.isEmpty()) {
            if(k % 2 == 0) {
                arr.add(pos.poll());
            } else {
                arr.add(neg.poll());
            }
            k++;
        }
        while(!pos.isEmpty()) {
            arr.add(pos.poll());
        }
        while(!neg.isEmpty()) {
            arr.add(neg.poll());
        }
    }
}