class Solution {
    public int maxConsecBits(int[] arr) {
        // Gautam's code here
        int ans = 1;
        int cnt = 1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
