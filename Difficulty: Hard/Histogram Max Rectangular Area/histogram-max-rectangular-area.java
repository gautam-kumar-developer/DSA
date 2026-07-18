class Solution {
    public static int getMaxArea(int arr[]) {
        int[] pse = getPrevSmaller(arr);
        int[] nse = getNextSmaller(arr);
        int n= arr.length;
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        
        return max;
    }
    
    public static int[] getPrevSmaller(int arr[]) {
        int n = arr.length;
        
        int[] ans = new int[n];
        
        Stack<Pair> st = new Stack<>();
        
        st.push(new Pair(arr[0], 0));
        
        ans[0] = -1;
        
        for(int i = 1; i < n; i++) {
            while(!st.empty() && st.peek().val >= arr[i]) st.pop();
            
            if(st.empty()) ans[i] = -1;
            
            else ans[i] = st.peek().idx;
            
            st.push(new Pair(arr[i], i));
        }
        
        return ans;
    }
    
    public static int[] getNextSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        
        Stack<Pair> st = new Stack<>();
        
        st.push(new Pair(arr[n - 1], n - 1));
        
        ans[n - 1] = n;
        
        for(int i = n - 2; i >= 0; i--) {
            while(!st.empty() && st.peek().val >= arr[i]) st.pop();
            
            if(st.empty()) ans[i] = n;
            
            else ans[i] = st.peek().idx;
            
            st.push(new Pair(arr[i], i));
        }
        
        return ans;
    }
}


class Pair{
    int val;
    int idx;
    public Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}