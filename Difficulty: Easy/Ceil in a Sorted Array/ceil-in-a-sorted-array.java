// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < x) 
                low = mid + 1;
            else { // mid might be greater or equal
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
