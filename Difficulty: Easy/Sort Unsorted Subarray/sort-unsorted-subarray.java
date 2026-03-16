class Solution {
    public int[] printUnsorted(int[] arr) {
        // Code here
        int[] ans = new int[2];
        int N = arr.length;
        int left = -1, right = -1;
    
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                left = i;
                break;
            }
        }
        
        for(int j = N -1; j > 0; j--) {
            if(arr[j - 1] > arr[j]) {
                right = j;
                break;
            }
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = left; i <= right; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        int k = 0;
        while((k < N) && (arr[k] <= min)){
            k++;
        }
        
        ans[0] = k;
        
        k = N - 1;
        while((k > 0) && (arr[k] >= max)){
            k--;
        }
        ans[1] = k;
        
        return ans;
        
    }
}