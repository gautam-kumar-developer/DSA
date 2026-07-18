class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Pair> st = new Stack<>();
        
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) ans.add(1);
        
        st.push(new Pair(arr[0], 0));
        
        for(int i = 1; i < n; i++) {
            while(!st.empty() && st.peek().val <= arr[i]) st.pop();
            if(!st.empty())
                ans.set(i, i - st.peek().idx);
            else ans.set(i, i + 1);
            st.push(new Pair(arr[i], i));
            
        }
        
        return ans;
        
    }
    
    
}

class Pair {
    int val;
    int idx;
    public Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}