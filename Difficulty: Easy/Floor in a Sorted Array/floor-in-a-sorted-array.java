class Solution {
    public int findFloor(int[] arr, int x) {
        
        
        
        int n = arr.length;
        int l= 0, h = n - 1;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            if(arr[mid] <= x)
                l = mid + 1;
            else
                h = mid - 1;
        }
        
        return l - 1;
    }
}
