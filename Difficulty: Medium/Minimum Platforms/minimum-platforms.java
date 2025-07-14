// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int maxTrain = 0;
        int minPlatform = 0;
        int i = 0, j = 0;
        
        while(i < arr.length && j < dep.length) {
            
            if(arr[i] <= dep[j]) {
                maxTrain++;
                i++;
                minPlatform = Math.max(minPlatform, maxTrain);
            }
            
            else {
                maxTrain--;
                j++;
            }
        }
        
        return minPlatform;
    }
}
