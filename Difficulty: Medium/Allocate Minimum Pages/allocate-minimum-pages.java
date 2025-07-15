
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k > n)
            return -1;
            
        int sum = 0;
        for(int elmt : arr) {
            sum += elmt;
        }
        
        int ans = -1;
        int start = 0, end = sum;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(isValid(arr, k , mid)) {
                ans = mid;
                end = mid - 1;
            } 
            
            else {
                start = mid + 1;
            }
        }
        
        return ans;
    }
    
    // function to check, is it valid to allocate pages to everyone without exceediing the limits
    private static boolean isValid(int[] arr, int k, int maxAllowedPages) {
        int n = arr.length;
        
        int students = 1, pages = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > maxAllowedPages) {
                return false;
            }
            
            if(pages + arr[i] <= maxAllowedPages) {
                pages += arr[i];
            }
            
            else {
                students++;
                pages = arr[i];
            }
        }
        
        return students <= k;
    }
    
}