class Solution {
    int findOnce(int[] arr) {
        // code here
        int n = arr.length;
        if(n == 1)
            return arr[0];
        int l = 0, h = n - 1;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(mid >= 1 && mid <= n - 2) {
                if(arr[mid] == arr[mid - 1]) {
                    if(mid % 2 != 0) {
                        l = mid + 1;
                    }
                    else {
                        h = mid - 1;
                    }
                }
                else if(arr[mid] == arr[mid + 1]) {
                    if(mid % 2 == 0) {
                        l = mid + 1;
                    }
                    else {
                        h = mid - 1;
                    }
                }
                
                else {
                    return arr[mid];
                }
            }
            else {
                return arr[mid];
            }
        }
        
        return -1;
    }
}