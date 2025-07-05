// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // Gautam's code here
        int prod = 1;
        int zeroes = 0;
        int idx = -1;
        int n = arr.length;
        // finding total product of arr and no. of zeroes with their index
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0){
                zeroes++;
                idx = i;
            } else {
                prod *= arr[i];
            }
        }
        
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        if(zeroes == 0) {
            for(int i = 0; i < n; i++)
                ans[i] = prod / arr[i];
        } else if (zeroes == 1) 
            ans[idx] = prod;
        
        return ans;
    }
}
