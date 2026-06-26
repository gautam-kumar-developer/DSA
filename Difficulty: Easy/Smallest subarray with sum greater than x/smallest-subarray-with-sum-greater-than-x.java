class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        
        int start = 0, end = -1;
        int sum = 0;
        for(int i = start; i < n; i++) {
            sum += arr[i];
            if(sum > x){
                end = i;
                break;
            }
        }
        
        if(end == n && sum <= x) return 0;

        int min = end - start + 1;
        
        while(start <= end) {
            if(sum > x){
                sum -= arr[start++];
            } else if(end < n - 1) {
                    sum += arr[++end];
            } else {
                return min;
            }
            
            if(sum > x) {
                min = Math.min(min, end - start + 1);
            }
        }
        
        return min;
    }
}
