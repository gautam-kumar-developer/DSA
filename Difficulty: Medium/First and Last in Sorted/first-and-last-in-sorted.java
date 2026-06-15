class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(firstOccurance(arr, x));
        ans.add(lastOccurance(arr, x));
        return ans;
    }
    
    int lastOccurance(int[] arr, int x) {
        int n = arr.length;
        int ans = -1;
        int l = 0, h = n - 1;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            if(arr[mid] == x) {
                ans = mid;
                l = mid + 1;
            } else if(arr[mid] < x) {
                l = mid + 1;
            } else 
                h = mid - 1;
        }
        
        return ans;
    }
    
    
    int firstOccurance(int[] arr, int x){
        int n = arr.length;
        int ans = -1;
        
        int l = 0, h = n - 1;
        
        while(l <= h) {
            int mid = l + (h - l) / 2;
            
            if(arr[mid] == x) {
                ans = mid;
                h = mid - 1;
            } else if(arr[mid] < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        return ans;
    }
}
