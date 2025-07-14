class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        if(n == 1)
            return arr[0];
        int vote = 1;
        int candidate = arr[0];
        
        for(int i = 1; i < n; i++) {
            if(arr[i] == candidate) {
                vote++;
            }
            else if(vote == 0 && candidate != arr[i]){
                vote = 1;
                candidate = arr[i];
            } 
            else 
                vote--;
        }
        
        int ans = 0;
        for(int elmt : arr) {
            if(elmt == candidate)
                ans++;
        }
        return ans > n / 2 ? candidate : -1;
    }
}