class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i = 0; i < n; i++) ans.add(-1);
        // ans.set(n - 1, -1);
        
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[n - 1]);
        
        for(int i = n - 2; i >= 0; i--) {
            while(!st.empty() && st.peek() <= arr[i]) st.pop();
            
            if(st.empty()) ans.set(i, -1);
            else ans.set(i, st.peek());
            
            st.push(arr[i]);
            
        }
        
        return ans;
    }
}