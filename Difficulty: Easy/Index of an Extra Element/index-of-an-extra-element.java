class Solution {
    public int findExtra(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        
        int l = 0, h = n - 1;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            if(mid < m) {
                if(a[mid] == b[mid])
                    l = mid + 1;
                else
                    h = mid - 1;
            }
            
            else 
                return mid;
        }
        return l;
    }
}