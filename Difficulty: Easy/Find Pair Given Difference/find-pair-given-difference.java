
class Solution {
    public boolean findPair(int[] arr, int x) {
        // Gautam's code here
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int target = arr[i] + x;
            if(binarySearch(arr, i + 1, n - 1, target))
                return true;
        }
        return false;
    }
    
    //Binary Search 
    private boolean binarySearch(int[] arr, int l, int r, int target) {
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] == target) 
                return true;
            else if(arr[mid] > target) 
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }
}
