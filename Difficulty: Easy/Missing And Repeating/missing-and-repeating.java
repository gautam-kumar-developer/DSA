class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = arr.length;
        int dup = -1;
        for(int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;
            
            if(arr[idx] < 0) {
                dup = idx + 1;
            } else {
                arr[idx] = -arr[idx];
            }
        }
        
        int mis = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                mis = i + 1;
            }
        }
        
        ans.add(dup);
        ans.add(mis);
        return ans;
    }
}
