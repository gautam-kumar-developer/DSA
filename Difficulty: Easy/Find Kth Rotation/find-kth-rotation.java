class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n = arr.size();
        if(n == 1)
            return 0;
            
        int pivot = -1;
        int l = 0, h = n - 1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(mid < n - 1 && arr.get(mid) > arr.get(mid + 1)){
                pivot = mid + 1;
                break;
            } else if(arr.get(mid) >= arr.get(l)) {
                l = mid + 1;
            } else  {
                h = mid - 1;
            }
        }
        
        if(pivot == -1)
            return 0;
        else
            return pivot;
    }
}