// User function Template for Java

class Solution {
    static long ValidPair(int a[], int n) {
        // Your code goes here
        Arrays.sort(a);
        
        long ans = 0;
        for(int i = 0; i < n - 1; i++) {
            int low = i + 1;
            int high = n - 1;
            long cnt = 0;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                long sum = a[i] + a[mid];
                if(sum > 0) {
                    cnt = n - mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            ans += cnt;
        }
        
        return ans;
    }
}
