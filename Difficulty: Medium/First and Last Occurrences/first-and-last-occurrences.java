// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = firstOccurence(arr, x);
        int last = lastOccurence(arr, x);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }
    
    // Function to find first occurence
    private int firstOccurence(int[] arr, int x) {
        
        int ans = -1;
        int l = 0, h = arr.length - 1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
             
            if(arr[mid] == x) {
                ans = mid;
                h = mid - 1;
            }
             
            else if(arr[mid] < x) {
                l = mid + 1;
            }
             
            else {
                h = mid - 1;
            }
        }
        
        return ans;
    }
    
    // Function to find first occurence
    private int lastOccurence(int[] arr, int x) {
        int ans = -1;
        int l = 0, h = arr.length - 1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
             
            if(arr[mid] == x) {
                ans = mid;
                l = mid + 1;
            }
             
            else if(arr[mid] < x) {
                l = mid + 1;
            }
             
            else {
                h = mid - 1;
            }
        }
        
        return ans;
    }
}
