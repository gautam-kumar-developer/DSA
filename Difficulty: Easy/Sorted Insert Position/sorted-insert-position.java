class Solution {
    public int searchInsertK(int arr[], int k) {
        int n = arr.length;
        
        if(k > arr[n - 1]) return n;
        
        int l = 0, h = n - 1;
        int ans = 0;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            if(arr[mid] == k) 
                return mid;
            else if(arr[mid] < k) {
                l = mid + 1;
                ans = l;
            }
            else {
                h = mid - 1;
            }
        }
        
        return ans;
    }
}