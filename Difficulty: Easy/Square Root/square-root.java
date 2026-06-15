class Solution {
    int floorSqrt(int n) {
        double target = Math.sqrt(n);
        
        int l = 1, h = n;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            if(mid == target)
                return mid;
            else if(mid < target)
                l = mid + 1;
                
            else 
                h = mid - 1;
        }
        return l - 1;
    }
}