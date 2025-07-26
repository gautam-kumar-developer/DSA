// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }
        
        int low = max;
        int high = sum;
        int ans = 0;
        while(low <= high) { // O(log n)
            int mid = low + (high - low) / 2;
            
            if(helper(arr, mid, n, d)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    // O(n)
    private static boolean helper(int[] arr, int mid, int n, int d) {
        int sum = 0;
        int day = 1;
        for(int i = 0; i < n; i++) {
            if(sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                sum = arr[i];
                day++;
            }
        }
        
        return (day <= d);
    }
}

// Time : O(n*log n)