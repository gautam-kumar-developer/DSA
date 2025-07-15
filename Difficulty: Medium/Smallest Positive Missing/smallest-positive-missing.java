class Solution {
    public int missingNumber(int[] arr) {
        
        // Using the Cycle sort
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            
            // Swapping the elements if they are not in their correct position
            while(arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            } 
            
        }
        
        // The element which is not at it's correct position will be our ans
         for(int i = 0; i < n; i++) {
             if(arr[i] != i + 1) {
                 return i + 1;
             }
         }
         
         // If here, means all the elements are present ans we have to return the next integer i.e. n + 1
         return n + 1;
    }
}


// Time : O(n) ans Space : O(1)