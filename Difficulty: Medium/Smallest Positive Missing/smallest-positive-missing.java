class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr) {
            if(val > 0) set.add(val);
        }
        int ans = n + 1;
        for(int i = 1; i <= n; i++) {
            if(!set.contains(i)) {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}
