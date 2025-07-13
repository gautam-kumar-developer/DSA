class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n = arr.length;
        int l = 0, h = n - 1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(mid < n - 1 && arr[mid] == 0 && arr[mid + 1] == 1){
                return mid + 1;
            }
            else if(arr[mid] == 0) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        if(l == n ) 
            return -1;
        else
            return l;
    }
}