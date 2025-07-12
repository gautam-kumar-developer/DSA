// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        
        //Edge case : 
        if(n == 1)
            return arr[0];
            
        // Position where rotation occurs  
        int pivot = -1;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(mid < n - 1 && arr[mid] > arr[mid + 1]){
                pivot = mid + 1;
                break;
            } else if(arr[left] <= arr[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        //if no rotation found, then return first element
        //else return element of the pivot index
        if(pivot == -1) 
            return arr[0];
        else
            return arr[pivot];
    }
}
