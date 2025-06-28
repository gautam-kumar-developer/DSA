class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // Gautam's code here
        int n = arr.length;
        for(int i = 0; i < n; i += k) {
            int l = i;
            int r = Math.min(i + k - 1, n - 1);
            reverse(arr, l, r);
        }
    }
    
    private void reverse(int[] arr, int l, int r) {
        while(l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}