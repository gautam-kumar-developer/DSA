class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        return upperBound(arr, target) - lowerBound(arr, target);
    }
    
    // Function to return Lower Bound
    static int lowerBound(int[] arr, int target) {
        int res = arr.length;
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                res = mid;
                hi = mid - 1;
            } 
          	else {
                lo = mid + 1;
            }
        }
        return res;
    }

    // Function to return Upper Bound
    static int upperBound(int[] arr, int target) {
        int res = arr.length;
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                res = mid;
                hi = mid - 1;
            } 
          	else {
                lo = mid + 1;
            }
        }
        return res;
    }
}
