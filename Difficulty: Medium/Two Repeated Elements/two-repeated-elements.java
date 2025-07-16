// User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        int[] ans = new int[2];
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            if(arr[val - 1] > 0) {
                arr[val - 1] *= -1;
            } else {
                ans[cnt++] = val;
                arr[val - 1] = Math.abs(arr[val - 1]);
                if(cnt > 1)
                    return ans;
            }
        }
        
        return ans;
    }
}