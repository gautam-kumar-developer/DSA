// User function Template for Java

class Solution {

    public static int longest(int arr[]) {
        // write code here
        int ans = 0;
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= max) {
                max = arr[i];
                ans++;
            }
        }
        return ans;
    }
}
