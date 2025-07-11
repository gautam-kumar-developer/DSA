// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        if(n < 2)   
            return ans;
        Arrays.sort(arr);
        int l = 0, h = n - 1;
        int diff = Integer.MAX_VALUE;
        while(l < h) {
            int currSum = arr[l] + arr[h];
            
            if(Math.abs(currSum - target) < diff) {
                diff = Math.abs(currSum - target);
                ans = Arrays.asList(arr[l], arr[h]);
            }
            
            if(currSum == target)
                return ans;
            if(currSum < target)
                l++;
            else 
                h--;
        }
        
        return ans;
    }
}