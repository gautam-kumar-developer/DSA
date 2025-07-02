// User function Template for Java
import java.util.Arrays;
class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // Gautam's code here
        List<List<Integer>> ans = new ArrayList<>();
        // Comparing the first element with lower
        if(lower < arr[0]) {
            ans.add(Arrays.asList(lower, arr[0] - 1));
        }
        
        // Comparing the inner elements
        int n = arr.length; 
        for(int i = 0; i < n - 1; i++) {
            if(arr[i + 1] - arr[i] >= 2) {
                ans.add(Arrays.asList(arr[i] + 1, arr[i + 1] - 1));
            }
        }
        
        // Comparing the last element with upper
        if(upper > arr[n -1]) {
            ans.add(Arrays.asList(arr[n - 1] + 1, upper));
        }
        
        return ans;
    }
}