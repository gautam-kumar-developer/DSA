class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
        Arrays.sort(b);
        
        for(int i = 0; i < n; i++) {
            ans.add(upperBound(b, a[i]));
        }
        
        return ans;
    }
    
    private static int upperBound(int[] arr, int x) {
        int ans = arr.length;
        int l = 0, h = arr.length - 1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(arr[mid] > x) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return ans;
    } 
}

// Time : O(nlogn + mlogm) => m*logm for sort + n*logn for find upperBound of each elmt
// Auxiliary Space : O(1)